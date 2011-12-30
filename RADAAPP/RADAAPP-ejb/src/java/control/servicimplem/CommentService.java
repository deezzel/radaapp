/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Comment;
import control.ICommentService;
import javax.validation.ConstraintViolationException;
import model.Publication;
import model.Users;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class CommentService extends Generic<Comment> implements ICommentService {

    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    public CommentService() {
        super(Comment.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public boolean add_Comment(Comment com, Publication pub, Users usr) {
        try {
            com.setAvtor(usr);
            com.setPublication(pub);
            create(com);
            pub.addComment(com);
            usr.addComment(com);
        } catch (ConstraintViolationException e) {
            System.out.print(e.getConstraintViolations());
            return false;
        }
        System.out.println("Yes!");
        return true;

    }

    @Override
    public boolean remove_Comment(Comment com, Publication pub, Users usr) {
        try {
            pub.delComment(com);
            usr.delComment(com);
            remove(com);

        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
/////////////////////////////

    @Override
    public List<Comment> getByPublication(Publication pub) {
        return (List<Comment>) em.createNamedQuery("Comment.findByPublic").setParameter("publication", pub).getResultList();
        //pub.getCommentList();
    }
}

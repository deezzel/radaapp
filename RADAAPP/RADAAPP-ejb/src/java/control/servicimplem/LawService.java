/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.ILawsService;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Deputatos;
import model.Laws;
import model.Sessions;
import model.Users;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class LawService extends Generic<Laws> implements ILawsService {

    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    public LawService() {
        super(Laws.class);
    }

    @Override
    public List<Laws> getByTitle(String title) {
        if (!title.equals("")) {
            return (List<Laws>) em.createNamedQuery("Laws.findByTitle").setParameter("title", title).getResultList();
        }
        return null;
    }

    @Override
    public List<Laws> getByDate(Date date) {
        if (null != date) {
            return (List<Laws>) em.createNamedQuery("Laws.findByTimeAccept").setParameter("timeAccept", date).getResultList();
        }
        return null;
    }

    @Override
    public List<Laws> getBySession(Sessions sess_id) {
        if (null != sess_id) {
            return (List<Laws>) em.createNamedQuery("Laws.findBySession").setParameter("session", sess_id).getResultList();
        }
        return null;
    }
    
    @Override
    public List<Laws> getByNOTSession(Sessions sess_id) {
        if (null != sess_id) {
            return (List<Laws>) em.createNamedQuery("Laws.findByNOTSession").setParameter("session", sess_id).getResultList();
        }
        return null;
    }

    @Override
    public List<Laws> findByText(String text) {
        List<Laws> lst_result = findAll();
        List<Laws> lst_source = findAll(); 
        for (int i=0; i<=lst_source.size()-1; i++){
            if (lst_source.get(i).getDescript().toLowerCase().indexOf(text.toLowerCase())==-1){
                 if (lst_source.get(i).getTitle().toLowerCase().indexOf(text.toLowerCase())==-1)
                lst_result.remove(lst_source.get(i));
           }
          
        }
        return lst_result;
        //return (List<Laws>) em.createNamedQuery("Laws.findByText").setParameter("descript", text).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public boolean addLaw(Laws law, Users deput) {
      try {
//          law.setAvtor(deput);
//          deput.addLaw(law);
          create(law);
      }catch (NullPointerException e)
      {
          return false;
      }
      return true;
    }

    @Override
    public boolean removeLaw(Laws law, Users deput) {
        try {
//          deput.delLaw(law);
          remove(law);
      }catch (NullPointerException e)
      {
          return false;
      }
      return true;
    }
}

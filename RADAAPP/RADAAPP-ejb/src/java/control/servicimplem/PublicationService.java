/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.IPublicationService;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Publication;
import model.Users;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class PublicationService extends Generic<Publication> implements IPublicationService {
    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;
    
    public PublicationService() {
        super(Publication.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
       return em;
    }

    @Override
    public List<Publication> getByTypeDate(String type) {
        return (List<Publication>)em.createNamedQuery("Publication.findByType").setParameter("type", type).getResultList();
   
    }

    @Override
    public List<Publication> findByText(String substr) {
        List<Publication> lst_result = findAll();
        List<Publication> lst_source = findAll(); 
        for (int i=0; i<=lst_source.size()-1; i++){
            if (lst_source.get(i).getText().toLowerCase().indexOf(substr.toLowerCase())==-1){
                 if (lst_source.get(i).getTitle().toLowerCase().indexOf(substr.toLowerCase())==-1)
                lst_result.remove(lst_source.get(i));
           }
          
        }
        return lst_result;     
    }
    
    @Override
    public List<Publication> findByDate(String date) {
        List<Publication> lst_result = findAll();
        List<Publication> lst_source = findAll(); 
        for (int i=0; i<=lst_source.size()-1; i++){
            if (lst_source.get(i).getDate_publ().toString().indexOf(date)==-1){
                 if (lst_source.get(i).getDate().toString().indexOf(date)==-1)
                lst_result.remove(lst_source.get(i));
           }
          
        }
        return lst_result;     
    }

    @Override
    public List<Publication> getByTitle(String title) {
       return (List<Publication>)em.createQuery("SELECT p FROM Publication p ORDER BY p.title").getResultList();
    }

    @Override
    public List<Publication> getByOrderDate(String type) {
        return (List<Publication>)em.createNamedQuery("Publication.findByOrderDate").getResultList();
    }

    @Override
    public List<Publication> getByAvtor(Users usr) {
        try {
            return (List<Publication>)em.createNamedQuery("Publication.findByAvtor").setParameter("avtor", usr).getResultList();
        }catch (NullPointerException e) {
            return null;
        }
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }
    
}

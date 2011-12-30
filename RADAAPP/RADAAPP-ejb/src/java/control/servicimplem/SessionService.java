/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.ISessionsService;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Sessions;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class SessionService extends Generic<Sessions> implements ISessionsService {

    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    public SessionService() {
        super(Sessions.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void persist(Object object) {
        em.persist(object);
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public List<Sessions> getByDate(Date date) {
     
        List<Sessions> lst_result = findAll();
        List<Sessions> lst_source = findAll(); 
        
        for (int i=0; i<=lst_source.size()-1; i++){
            String dtmp = date.toString().substring(0, 11);
            if (lst_source.get(i).getTimeleadthrou().toString().indexOf(dtmp)==-1){
                 //if (lst_source.get(i).getDate().toString().indexOf(date)==-1)
                lst_result.remove(lst_source.get(i));
           }
          
        }
        return lst_result;     
    }
        //return (List<Sessions>) em.createNamedQuery("Sessions.findByTimeleadthrou").setParameter("timeleadthrou", dat).getResultList();
    

    @Override
    public List<Sessions> getByOrderDate() {
        return (List<Sessions>) em.createQuery("SELECT s FROM Sessions s ORDER BY s.timeleadthrou").getResultList();
    }

    @Override
    public List<Sessions> findByType(String type) {
        return (List<Sessions>) em.createNamedQuery("Sessions.findByType").setParameter("type", type).getResultList();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.IDeputatosService;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Deputatos;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class DeputatService extends Generic<Deputatos> implements IDeputatosService{
    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    public DeputatService() {
        super(Deputatos.class);
    }

    
    @Override
    public List<Deputatos> getByShipment(Long id_ship) {
        if (null != id_ship) {
            return (List<Deputatos>)em.createNamedQuery("Deputatos.findByShipment").setParameter("shipment", id_ship).getResultList();
        }
        return null;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

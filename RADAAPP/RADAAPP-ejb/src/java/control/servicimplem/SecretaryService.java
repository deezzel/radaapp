/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.ISecretaryService;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Secretary;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class SecretaryService extends Generic<Secretary> implements ISecretaryService {

    public SecretaryService() {
        super(Secretary.class);
    }
    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }
    
}

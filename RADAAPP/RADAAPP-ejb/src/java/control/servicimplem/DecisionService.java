/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.IDecisionService;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import model.Decision;
import model.Laws;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class DecisionService extends Generic<Decision> implements IDecisionService {

    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    public DecisionService() {
        super(Decision.class);
    }

    @Override
    public Decision getByLaw(Laws law) {
        try {
        return (Decision)em.createNamedQuery("Decision.findByLaw").setParameter("law", law).getSingleResult();
        }
        catch (NoResultException e){
            return null;
        }
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
    public boolean addDecision(Decision decis, Laws law) {
        try {
            decis.setLaw(law);
            law.setDecision(decis);
            create(decis);
        }catch (NullPointerException e){
            return false;
        }
        return true;
    }
}

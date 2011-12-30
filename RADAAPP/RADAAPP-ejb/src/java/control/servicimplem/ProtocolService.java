/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import control.IProtocolService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Deputatos;
import model.Protocol;
import model.Sessions;

/**
 *
 * @author Julia
 */
@Stateless
@LocalBean
public class ProtocolService extends Generic<Protocol> implements IProtocolService {

    @EJB
    private DeputatService deputatService;
    @PersistenceContext(unitName = "RADAAPP-ejbPU")
    private EntityManager em;

    public ProtocolService() {
        super(Protocol.class);
    }

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public List<Protocol> getBySession(Long id_sess) {
        return (List<Protocol>) em.createNamedQuery("Protocol.findBySession").setParameter("session", id_sess).getResultList();
    }

    @Override
    public List<Protocol> getBySessionS(Sessions sess) {
        return (List<Protocol>) em.createNamedQuery("Protocol.findBySession").setParameter("session", sess).getResultList();
                //sess.getProtocolList();
    }

    @Override
    public List<Deputatos> getDepbyProt(Long id) {
        
        return null;
    }

    @Override
    public boolean addProtocol(Protocol prot, Sessions sess) {
        try {
            prot.setSession(sess);
            sess.addProtoc(prot);
            create(prot);
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delProtocol(Protocol prot, Sessions sess) {
        try {
            sess.delProtoc(prot);
            remove(prot);
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}

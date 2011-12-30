/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.DecisionService;
import control.servicimplem.LawService;
import control.servicimplem.ProtocolService;
import control.servicimplem.SessionService;
import control.servicimplem.UserService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Decision;
import model.Laws;
import model.Protocol;
import model.Sessions;
import model.Users;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "sessmb")
@ViewScoped
public class SessionManagedBean {

    @EJB
    private UserService userService;
    @EJB
    private DecisionService decisionService;
    @EJB
    private LawService lawService;
    @EJB
    private ProtocolService protocolService;
    @EJB
    private SessionService sessionService;
    private Sessions currSess;
    private Decision decis;
    private Protocol currProtocol = new Protocol();
    private String id_protocol;
    private String id_deput;
    private String id_law;
    private Laws lawToSess;
    private String law;
    private List<Laws> lstLawSess;

    public String getId_law() {
        return id_law;
    }

    public void setId_law(String id_law) {
        this.id_law = id_law;
    }

        
    public void setLstLawSess(List<Laws> lstLawSess) {
        this.lstLawSess = lstLawSess;
    }

    public String getLaw() {
        return law;
    }

    public void setLaw(String law) {
        this.law = law;
    }

    public Laws getLawToSess() {
        return lawToSess;
    }

    public void setLawToSess(Laws lawToSess) {
        this.lawToSess = lawToSess;
    }

    public String getId_deput() {
        return id_deput;
    }

    public void setId_deput(String id_deput) {
        this.id_deput = id_deput;
    }

    public String getId_protocol() {
        return id_protocol;
    }

    public void setId_protocol(String id_protocol) {
        this.id_protocol = id_protocol;
    }

    public Protocol getCurrProtocol() {
        return currProtocol;
    }

    public void setCurrProtocol(Protocol currProtocol) {
        this.currProtocol = currProtocol;
    }

    public Decision getDecis() {
        return decis;
    }

    public void setDecis(Decision decis) {
        this.decis = decis;
    }

    public Sessions getCurrSess() {
        return currSess;
    }

    public void setCurrSess(Sessions currSess) {
        this.currSess = currSess;
    }

    public void addProtocol() {
        System.out.print(currProtocol.getText() + "-----------------------");
        protocolService.addProtocol(currProtocol, currSess);
//        try {
//            FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/Session.xhtml?id_sess=" + currSess.getId().toString());
//
//        } catch (IOException ex) {
//            Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void addToProtocol() {
        System.out.print(id_protocol + "-------------------------");
        Long id = new Long(id_protocol);
        Protocol currentProtocol = protocolService.find(Long.valueOf(id));
        Long id_usr = new Long(id_deput);
        Users deputatos = userService.find(Long.valueOf(id_usr));
        currentProtocol.setDeputat(deputatos);
        protocolService.edit(currentProtocol);
//             try {
//            FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/Session.xhtml?id_sess=" + currSess.getId().toString());
//
//        } catch (IOException ex) {
//            Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void removeProtocol() {
        Long id = new Long(id_protocol);
        Protocol delProt = protocolService.find(Long.valueOf(id));
        delProt.setDeputat(null);
        delProt.setAvtor(null);
        protocolService.delProtocol(delProt, currSess);
//        try {
//            FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/Session.xhtml?id_sess=" + currSess.getId().toString());
//
//        } catch (IOException ex) {
//            Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public List<Protocol> getLstProtocol() {
        return protocolService.getBySessionS(currSess);
    }
//    public List<Deputatos> getListDeputatos() {
//        return protocolService.getDepbyProt(protocolId);
//    }

    @PostConstruct
    public void init() {
        String id_sess = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_sess");
        Long id = new Long(id_sess);
        
        try {
            currSess = (Sessions) sessionService.find(Long.valueOf(id));
          //  lstLawsBySession = lawService.getBySession(currSess);
            
            // decis = decisionService.getByLaw(law);
            //  lstComm = commentService.getByPublication(currentPubl);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public List<Laws> getLstLawsBySession() {
        return lawService.getBySession(currSess);
    }

    public List<Laws> getLstLawSess() {
        try {
            //  lstLawSess = lawService.getByNOTSession(currSess);
            lstLawSess = lawService.findAll();
            return lstLawSess;
        } catch (NullPointerException e) {
            return lstLawSess;
        }

    }


    public void addLawToSession() {
//          System.out.print(law + "---------------------");
        lawToSess = lawService.find(Long.valueOf(law));
        //   System.out.print(lawToSess + "---------------------");
        lawToSess.setSession(currSess);
        lawService.edit(lawToSess);
    }

    
    /** Creates a new instance of SessionManagedBean */
    public SessionManagedBean() {
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

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
import model.Protocol;
import model.Sessions;
import model.Users;

/**
 *
 * @author Julia
 */
@ManagedBean
@ViewScoped
public class QuestionManagedBean {
    @EJB
    private UserService userService;
    @EJB
    private ProtocolService protocolService;
    @EJB
    private SessionService sessionService;
    private String id_deput;
    private String id_protocol;
    private Sessions currSess;

    public Sessions getCurrSess() {
        return currSess;
    }

    public void setCurrSess(Sessions currSess) {
        this.currSess = currSess;
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
    
    
      public List<Protocol> getLstProtocol() {
        return protocolService.getBySessionS(currSess);
    }
      
      
    @PostConstruct
    public void init() {
        String id_sess = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_sess");
        Long id = new Long(id_sess);
        try {
            currSess = (Sessions) sessionService.find(Long.valueOf(id));
            // decis = decisionService.getByLaw(law);
            //  lstComm = commentService.getByPublication(currentPubl);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    
    
     public void addToProtocol () {
        System.out.print(id_protocol+"-------------------------");
        Long id = new Long(id_protocol);
        Protocol currentProtocol = protocolService.find(Long.valueOf(id));
        Long id_usr = new Long(id_deput);
        Users deputatos = userService.find(Long.valueOf(id_usr));
        currentProtocol.setDeputat(deputatos);
        protocolService.edit(currentProtocol);
     }
    
              
     public void removeFromProtocol () {
        System.out.print(id_protocol+"-------------------------");
        Long id = new Long(id_protocol);
        Protocol currentProtocol = protocolService.find(Long.valueOf(id));
//        Long id_usr = new Long(id_deput);
//        Users deputatos = userService.find(Long.valueOf(id_usr));
        currentProtocol.setDeputat(null);
        protocolService.edit(currentProtocol);
     }
     
    /** Creates a new instance of QuestionManagedBean */
    public QuestionManagedBean() {
    }
}

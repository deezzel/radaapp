/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.SessionService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Sessions;

/**
 *
 * @author Julia
 */
@ManagedBean (name ="updateSessmb")
@ViewScoped
public class UpdateSessionManagedBean {
    @EJB
    private SessionService sessionService;
    private Sessions currSess;

    public Sessions getCurrSess() {
        return currSess;
    }

    public void setCurrSess(Sessions currSess) {
        this.currSess = currSess;
    }
    
    public void updateSessions (){
        sessionService.edit(currSess);
           try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/Session.xhtml?id_sess="+currSess.getId().toString());
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    /** Creates a new instance of UpdateSessionManagedBean */
    public UpdateSessionManagedBean() {
    }
}

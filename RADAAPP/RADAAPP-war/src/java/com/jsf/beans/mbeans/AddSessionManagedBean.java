/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.JsfUtil;
import control.servicimplem.SessionService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.Sessions;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "addsessmb")
@RequestScoped
public class AddSessionManagedBean {

    @EJB
    private SessionService sessionService;
    private Sessions currSession = new Sessions();
    @ManagedProperty(value = "#{userManagedBean}")
    private UsersManagedBean usrMB;

    public void setUsrMB(UsersManagedBean usrMB) {
        this.usrMB = usrMB;
    }

    public Sessions getCurrSession() {
        return currSession;
    }

    public void setCurrSession(Sessions currSession) {
        this.currSession = currSession;
    }

    public void addSession() {
        if (currSession.getTimeleadthrou().after(java.util.Calendar.getInstance().getTime())) {
                currSession.setSecretary(usrMB.getCurrentUser());
                sessionService.create(currSession);
                  try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/sessions.xhtml");
                 
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else {
            JsfUtil.addErrorMessage("Wrong date");
             
            }
        }
    

    /** Creates a new instance of AddSessionManagedBean */
    public AddSessionManagedBean() {
    }
}

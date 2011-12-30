/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.JsfUtil;
import control.servicimplem.LawService;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Laws;

/**
 *
 * @author Julia
 */
@ManagedBean (name = "addlawmb")
@ViewScoped
public class AddLawManagedBean implements Serializable{
    @EJB
    private LawService lawService;
    private Laws currLaw = new Laws();
    
     @ManagedProperty(value = "#{userManagedBean}")
    private UsersManagedBean usrMB;

    public void setUsrMB(UsersManagedBean usrMB) {
        this.usrMB = usrMB;
    }

    public Laws getCurrLaw() {
        return currLaw;
    }

    public void setCurrLaw(Laws currLaw) {
        this.currLaw = currLaw;
    }
    
       
    public void addLaws () {
        //    Users usr = new Users();
         //   System.out.print("sdgfvergbet");
        
       if ((currLaw.getDescript() !=null) || (null != currLaw.getTitle())) {
           currLaw.setAvtor(usrMB.getCurrentUser());
           lawService.create(currLaw);  
             try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/Laws.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       
        }    
        else
       JsfUtil.addErrorMessage("Put some text and title!");
        
    }

    /** Creates a new instance of AddLawManagedBean */
    public AddLawManagedBean() {
    }
}

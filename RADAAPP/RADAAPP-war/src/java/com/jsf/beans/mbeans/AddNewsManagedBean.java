/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.Constants;
import com.jsf.util.JsfUtil;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import control.IPublicationService;
import control.servicimplem.PublicationService;
import control.servicimplem.UserService;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Publication;
import model.Users;

/**
 *
 * @author Julia
 */
@ManagedBean (name = "addnew_mb")
@ViewScoped
public class AddNewsManagedBean implements Serializable {
    @EJB
    private PublicationService publicationService;
    private Publication currpubl = new Publication();

    @ManagedProperty(value = "#{userManagedBean}")
    private UsersManagedBean usrMB;

    public void setUsrMB(UsersManagedBean usrMB) {
        this.usrMB = usrMB;
    }    
    
    public Publication getCurrpubl() {
        return currpubl;
    }

    public void setCurrpubl(Publication currpubl) {
        this.currpubl = currpubl;
    }
    
    public void addNew (String type) {
        //    Users usr = new Users();
         //   System.out.print("sdgfvergbet");
         System.out.println(currpubl.getText());
            System.out.println(currpubl.getTitle());
       if ((currpubl.getText() !=null) || (null != currpubl.getTitle())) {
           
            currpubl.setDate_publ(java.util.Calendar.getInstance().getTime());
            currpubl.setAvtor(usrMB.getCurrentUser());
            currpubl.setType(type);
            publicationService.create(currpubl);  
             try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/articles.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       
        }    
        else
       JsfUtil.addErrorMessage("Put some text and title!");
        
    }
    
    /** Creates a new instance of AddNewsManagedBean */
    public AddNewsManagedBean() {
    }
}

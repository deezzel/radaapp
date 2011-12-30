/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.PublicationService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Publication;

/**
 *
 * @author Julia
 */
@ManagedBean (name = "updatemb")
@ViewScoped
public class UpdateNewsManagedBean {
    @EJB
    private PublicationService publicationService;
    private Publication updatePubl;

    public Publication getUpdatePubl() {
        return updatePubl;
    }

    public void setUpdatePubl(Publication updatePubl) {
        this.updatePubl = updatePubl;
    }
    
   public void updateNews (){
    publicationService.edit(updatePubl);
    
   // updatePubl = null;
     try {   FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/index.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    
       
    @PostConstruct
    public void init() {
        String id_new = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("idnew");
        Long id = new Long(id_new);
        try {
            updatePubl = (Publication) publicationService.find(new Long(id));
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());
            System.out.print(updatePubl.getText());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    /** Creates a new instance of UpdateNewsManagedBean */
    public UpdateNewsManagedBean() {
    }
}

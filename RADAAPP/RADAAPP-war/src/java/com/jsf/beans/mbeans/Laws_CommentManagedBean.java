/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.LawService;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Laws;

/**
 *
 * @author Julia
 */
@ManagedBean (name = "lawmb")
@RequestScoped
public class Laws_CommentManagedBean {
    @EJB
    private LawService lawService;
    private Laws currLaw;

    public Laws getCurrLaw() {
        return currLaw;
    }

    public void setCurrLaw(Laws currLaw) {
        this.currLaw = currLaw;
    }
    
    
     @PostConstruct
    public void init() {
        String id_law = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_law");
        Long id = new Long(id_law);
        try {
            currLaw = (Laws) lawService.find(new Long(id));
           System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    

    /** Creates a new instance of Laws_CommentManagedBean */
    public Laws_CommentManagedBean() {
    }
}

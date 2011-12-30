/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.LawService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Laws;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "updlawsmb")
@ViewScoped
public class UpdateLawsManagedBean {

    @EJB
    private LawService lawService;
    private Laws curLaws;

    public Laws getCurLaws() {
        return curLaws;
    }

    public void setCurLaws(Laws curLaws) {
        this.curLaws = curLaws;
    }

    

    public void updateLaw() {
        lawService.edit(curLaws);

        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/Laws.xhtml");

        } catch (IOException ex) {
            Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void init() {
        String id_law = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_laws");
        Long id = new Long(id_law);
        try {
            curLaws = (Laws) lawService.find(Long.valueOf(id));
            //lstComm = commentService.getByPublication(currentPubl);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    /** Creates a new instance of UpdateLawsManagedBean */
    public UpdateLawsManagedBean() {
    }
}

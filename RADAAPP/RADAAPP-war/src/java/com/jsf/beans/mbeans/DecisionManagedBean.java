/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.DecisionService;
import control.servicimplem.LawService;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Decision;
import model.Laws;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "decisionmb")
@RequestScoped
public class DecisionManagedBean {

    @EJB
    private LawService lawService;
    @EJB
    private DecisionService decisionService;
    private Decision currDecision;
    private Laws currLaw;

    public Laws getCurrLaw() {
        return currLaw;
    }

    public void setCurrLaw(Laws currLaw) {
        this.currLaw = currLaw;
    }
    
    

    public Decision getCurrDecision() {
        return currDecision;
    }

    public void setCurrDecision(Decision currDecision) {
        this.currDecision = currDecision;
    }

    @PostConstruct
    public void init() {
        String id_law = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_law");
        Long id = new Long(id_law);
        try {
            currLaw = (Laws) lawService.find(new Long(id));
            currDecision = decisionService.getByLaw(currLaw);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    /** Creates a new instance of DecisionManagedBean */
    public DecisionManagedBean() {
    }
}

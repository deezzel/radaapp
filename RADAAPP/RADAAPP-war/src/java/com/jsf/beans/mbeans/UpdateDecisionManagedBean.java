/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.DecisionService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Decision;

/**
 *
 * @author Julia
 */
@ManagedBean (name = "updatedecismb")
@ViewScoped
public class UpdateDecisionManagedBean {
    @EJB
    private DecisionService decisionService;
    private Decision currDecis;

    public Decision getCurrDecis() {
        return currDecis;
    }

    public void setCurrDecis(Decision currDecis) {
        this.currDecis = currDecis;
    }
    
      @PostConstruct
    public void init() {
        String id_decis = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_decis");
         Long id = new Long(id_decis);
        try {
            currDecis = (Decision)decisionService.find(new Long(id));
       //     currDecision = decisionService.getByLaw(currLaw);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    
    }
      
      public void updateDecision(){
          decisionService.edit(currDecis);
         // System.out.print(currDecis.getLaw()+"---------------------");
               try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/DecisionByLaw.xhtml?id_law="+currDecis.getLaw().getId().toString());
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
    
    /** Creates a new instance of UpdateDecisionManagedBean */
    public UpdateDecisionManagedBean() {
    }
}

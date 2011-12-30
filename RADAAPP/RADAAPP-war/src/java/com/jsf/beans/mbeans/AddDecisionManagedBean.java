/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.DecisionService;
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
import model.Decision;
import model.Laws;

/**
 *
 * @author Julia
 */
@ManagedBean (name = "addDecisionmb")
@ViewScoped
public class AddDecisionManagedBean {
    @EJB
    private LawService lawService;
    @EJB
    private DecisionService decisionService;
    private Decision currDecision = new Decision();
    private Laws currLaw;
    private String cntZA;
    private String cntPROTIV;

    public String getCntPROTIV() {
        return cntPROTIV;
    }

    public void setCntPROTIV(String cntPROTIV) {
        this.cntPROTIV = cntPROTIV;
    }
    
    

    public void setCntZA(String cntZA) {
        this.cntZA = cntZA;
    }

    public String getCntZA() {
        return cntZA;
    }
    
    

    public Decision getCurrDecision() {
     //   currDecision = decisionService.getByLaw(currLaw);
        return currDecision;
    }

    public void setCurrDecision(Decision currDecision) {
        this.currDecision = currDecision;
    }
         
    public void addDecision (){
       // currDecision.setLaw(currLaw);
//        currDecision.setCntza(Integer.parseInt(cntZA));
//         currDecision.setCntprotiv(Integer.parseInt(cntPROTIV));
        decisionService.addDecision(currDecision, currLaw);
        
       try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/DecisionByLaw.xhtml?id_law="+currDecision.getLaw().getId().toString());
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    
     @PostConstruct
    public void init() {
        String id_law = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_law");
        Long id = new Long(id_law);
        try {
            currLaw = (Laws) lawService.find(new Long(id));
       //     currDecision = decisionService.getByLaw(currLaw);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    /** Creates a new instance of AddDecisionManagedBean */
    public AddDecisionManagedBean() {
    }
}

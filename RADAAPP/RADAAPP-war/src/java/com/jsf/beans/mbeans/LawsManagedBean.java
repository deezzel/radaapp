/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.LawService;
import control.servicimplem.SessionService;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Laws;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "lawsmb_main")
@SessionScoped
public class LawsManagedBean {
    @EJB
    private SessionService sessionService;
    @EJB
    private LawService lawService;
    private List<Laws> lstLaw;
    private String id_law;
    private Laws currentLaw;
   
    
    public Laws getCurrentLaw() {
        return currentLaw;
    }
    

    public String getId_law() {
        return id_law;
    }

    public void setId_law(String id_law) {
        this.id_law = id_law;
    }
    
    
    
    public List<Laws> getLstLaw() {
//        if (null == lstLaw) {
            lstLaw = (List<Laws>) lawService.findAll();
//        }
        return lstLaw;
    }
    
    
    
    public void delLaws() {
        Long id = new Long(id_law);
        currentLaw = lawService.find(id);
        lawService.remove(currentLaw);
       // System.out.print(currentPubl.getText());
    }

    /** Creates a new instance of LawsManagedBean */
    public LawsManagedBean() {
    }
}

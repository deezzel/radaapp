/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.Constants;
import control.servicimplem.LawService;
import control.servicimplem.PublicationService;
import control.servicimplem.SessionService;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import model.Laws;
import model.Publication;
import model.Sessions;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "mainMB")
@SessionScoped
public class MainManagedBean {
    @EJB
    private LawService lawService;
    @EJB
    private SessionService sessionService;
    @EJB
    private PublicationService publicationService;
    @ManagedProperty(value = "#{userManagedBean}")
    private UsersManagedBean usrMB;
    private List<Sessions> lstSess;
    private List<Publication> lstArt, lstNews;
    private Publication currentPubl;
    private Publication pub;
    private String id_pub;
    private String id_sess;

    public String getId_pub() {
        return id_pub;
    }

    public String getId_sess() {
        return id_sess;
    }
    
    public void setId_sess(String id_sess) {
        this.id_sess = id_sess;
    }

    public void setId_pub(String id_pub) {
        this.id_pub = id_pub;
        System.out.println(this.id_pub);
    }

    public void setUsrMB(UsersManagedBean usrMB) {
        this.usrMB = usrMB;
    }

    public void delNews() {
        System.out.print(id_pub);
        Long id = new Long(id_pub);
        currentPubl = publicationService.find(Long.valueOf(id));
        publicationService.remove(currentPubl);
        //  System.out.print(currentPubl.getText());
    }

     public boolean isSecretaryorDeputatos() {
        if (usrMB.getCurrentUser() != null) {
            if ((usrMB.getCurrentUser().getRoleuser().equals("2"))) {
                return false;
            }
            else if (usrMB.getCurrentUser().getRoleuser().equals("3")){
                  return false;
            }
        }
        return true;
    }
    
    public void delSession() {
        Long id = new Long(id_sess);
         Sessions sess = sessionService.find(id);
         sessionService.remove(sess);
    }

    public boolean isSecretary() {
        if (usrMB.getCurrentUser() != null) {
            if (usrMB.getCurrentUser().getRoleuser().equals("2")) {
                return false;
            }
        }
        return true;
    }

    public boolean isDeputatos() {
        if (usrMB.getCurrentUser() != null) {
            if (usrMB.getCurrentUser().getRoleuser().equals("3")) {
                return false;
            }
        }
        return true;
    }

    public List<String> globalSearch() {
        return null;
    }

    public Publication getCurrentPubl() {
        return currentPubl;
    }

    public void setCurrentPubl(Publication currentPubl) {
        this.currentPubl = currentPubl;
    }

    public List<Publication> getLstArt() {
        setLstPublication();
        return lstArt;
    }

    public List<Publication> getLstNews() {
        setLstPublication();
        return lstNews;
    }

    public List<Sessions> getLstSess() {
        if ((null == usrMB.getCurrentUser()) || (usrMB.getCurrentUser().getRoleuser().equals("1"))) {
         return  lstSess = (List<Sessions>) sessionService.findByType("1");
        }
        return lstSess = (List<Sessions>) sessionService.findAll();
    }

    public void setLstPublication() {
        lstNews = (List<Publication>) publicationService.getByTypeDate("1");
        lstArt = (List<Publication>) publicationService.getByTypeDate("2");

    }

    //////////////////////////////
//        public void onRowSelect(SelectEvent event) {  
//        FacesMessage msg = new FacesMessage("Car Selected", ((Publication) event.getObject()).getText());  
//  
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//    }  
//  
//    public void onRowUnselect(UnselectEvent event) {  
//        FacesMessage msg = new FacesMessage("Car Unselected", ((Publication) event.getObject()).getText());  
//  
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//    }  
//  
//    public String onRowSelectNavigate(SelectEvent event) {  
//        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("currentPubl", event.getObject());  
//  
//        return "News_Comment?faces-redirect=true";  
//    }  
    ////////////////////////////////
    /** Creates a new instance of MainManagedBean */
    public MainManagedBean() {
    }
}

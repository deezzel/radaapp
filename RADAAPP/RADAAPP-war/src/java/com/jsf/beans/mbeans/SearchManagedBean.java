/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.LawService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import model.Publication;
import control.servicimplem.PublicationService;
import control.servicimplem.SessionService;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Laws;
import model.Sessions;
/**
 *
 * @author deezzel
 */
@ManagedBean(name="searchMB")
@SessionScoped
public class SearchManagedBean {
    @EJB
    private LawService lawService;
    /** Creates a new instance of SearchManagedBean */
    @EJB
    private PublicationService publicationService;
    @EJB
    private SessionService sessionsService;
    private List<Publication> articles;
    private List<Laws> laws;
    private List<Sessions> sess;

    public List<Sessions> getSess() {
        return sess;
    }

    public void setSess(List<Sessions> sess) {
        this.sess = sess;
    }
    private String substr;
    private Date date;
    

    public List<Laws> getLaws() {
        return laws;
    }

    public void setLaws(List<Laws> laws) {
        this.laws = laws;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

    public List<Publication> getArticles() {
        return articles;
    }

    public void setArticles(List<Publication> articles) {
        this.articles = articles;
    }

    public String getSubstr() {
        return substr;
    }

    public void setSubstr(String substr) {
        this.substr = substr;
    }
    
    public void publSerch(){
        try {
            articles = (List<Publication>) publicationService.findByText(substr);
            laws = (List<Laws>)lawService.findByText(substr);
            FacesContext.getCurrentInstance().getExternalContext().redirect("search.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(SearchManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void serchByDate(){
        try {
            sess = (List<Sessions>) sessionsService.getByDate(date);
            
            FacesContext.getCurrentInstance().getExternalContext().redirect("search.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(SearchManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void publSerchByIndexies(){
        try {
           // articles = (List<Publication>) publicationService.findIndexies(substr);
            //laws = (List<Laws>)lawService.findByText(substr);
            FacesContext.getCurrentInstance().getExternalContext().redirect("search.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(SearchManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    public SearchManagedBean() {
    }
}

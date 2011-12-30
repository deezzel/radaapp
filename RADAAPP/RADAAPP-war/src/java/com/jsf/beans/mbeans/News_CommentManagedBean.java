/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.JsfUtil;
import control.servicimplem.CommentService;
import control.servicimplem.PublicationService;
import control.servicimplem.UserService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Comment;
import model.Publication;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "newcomm_mb")
@ViewScoped
public class News_CommentManagedBean implements Serializable {
    
    @EJB
    private UserService userService;
    @EJB
    private CommentService commentService;
    @EJB
    private PublicationService publicationService;
    private Publication currentPubl;
    private Comment delComm;
    private Comment currComm = new Comment();
    
    @ManagedProperty(value = "#{userManagedBean}")
    private UsersManagedBean usrMB;
    
    private String id_comm;
    private String id_news;
    private List<Comment> lstComm;
    
    public List<Comment> getLstComm() {
        return lstComm;
    }
    
    public void setLstComm(List<Comment> lstComm) {
        this.lstComm = lstComm;
    }
    
    public void setId_news(String id_news) {
        this.id_news = id_news;
    }
    
    public void setId_comm(String id_comm) {
        this.id_comm = id_comm;
    }
    
    public void setUsrMB(UsersManagedBean usrMB) {
        this.usrMB = usrMB;
    }
    
    public Comment getCurrComm() {
        return currComm;
    }
    
    public void setCurrComm(Comment currComm) {
        this.currComm = currComm;
    }
    
    public String getHello() {
        if (usrMB.getCurrentUser() != null) {
            return "Welcome, " + usrMB.getCurrentUser().getLogin() + "!";
        } else {
            return "Fucking";
        }
    }
    
    public boolean isRegister() {
        if ((usrMB.getCurrentUser() == null) || (usrMB.getCurrentUser().getRoleuser().equals("2"))) {
            return true;
        }
        
        return false;
    }
    
    public boolean isAvtorComment() {
        if (usrMB.getCurrentUser() == null) {
            return true;
        }
        return false;
    }
    
    public boolean isAvtorCurrUser (Comment comm) {
        if (usrMB.getCurrentUser().getLogin().equals(comm.getAvtor().getLogin())){
            return true;
        }
        return false;
    }
    
    public void addComment() {
//        if (currComm.getText() == null){
        currComm.setDatecomm(java.util.Calendar.getInstance().getTime());
        if (!currComm.getText().equals("")) {
            if (commentService.add_Comment(currComm, currentPubl, usrMB.getCurrentUser())) {                
                lstComm = commentService.getByPublication(currentPubl);
                currComm.setText("");
            } else {
                JsfUtil.addSuccessMessage("I NE do it!");
            }
        } else {
            JsfUtil.addSuccessMessage("The comment is empty!");
        }
        //  System.out.print(currentPubl.getCommentList().size()); 
//        }
        
    }
    
    public void delComment() {
        Long id_c = new Long(id_comm);
        delComm = commentService.find(new Long(id_c));
        commentService.remove_Comment(delComm, currentPubl, delComm.getAvtor());
        lstComm = commentService.getByPublication(currentPubl);
        System.out.println(this.id_comm);
    }
    
    @PostConstruct
    public void init() {
        String id_new = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_news");
        Long id = new Long(id_new);
        try {
            currentPubl = (Publication) publicationService.find(new Long(id));
            lstComm = commentService.getByPublication(currentPubl);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public Publication getCurrentPubl() {
        return currentPubl;
    }
    
    public void setCurrentPubl(Publication currentPubl) {
        this.currentPubl = currentPubl;
    }

    /** Creates a new instance of News_CommentManagedBean */
    public News_CommentManagedBean() {
        //    currentPubl = (Publication) publicationService.find(id_news);
    }
//    
}

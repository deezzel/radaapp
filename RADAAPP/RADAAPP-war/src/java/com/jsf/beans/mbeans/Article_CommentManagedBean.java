/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.JsfUtil;
import control.servicimplem.CommentService;
import control.servicimplem.PublicationService;
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
@ManagedBean(name = "articlemb")
@ViewScoped
public class Article_CommentManagedBean  implements Serializable {

    @EJB
    private CommentService commentService;
    @EJB
    private PublicationService publicationService;
    private Publication curpublic;
    private List<Comment> lstComm;
    private Comment delComm;
    private Comment currComm = new Comment();
    @ManagedProperty(value = "#{userManagedBean}")
    private UsersManagedBean usrMB;
    private String id_comm;

    public String getId_comm() {
        return id_comm;
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
    
    public List<Comment> getLstComm() {
        return lstComm;
    }

    public void setLstComm(List<Comment> lstComm) {
        this.lstComm = lstComm;
    }

    public Publication getCurpublic() {
        return curpublic;
    }

    public void setCurpublic(Publication curpublic) {
        this.curpublic = curpublic;
    }

    @PostConstruct
    public void init() {
        String id_article = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_article");
      //  if (null != id_article) {
        Long id = new Long(id_article);
        try {
            curpublic = (Publication) publicationService.find(Long.valueOf(id));
            lstComm = commentService.getByPublication(curpublic);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        }
       // else lstComm = commentService.getByPublication(curpublic);
   // }
    
        public boolean isRegister() {
        if ((usrMB.getCurrentUser() == null) || (usrMB.getCurrentUser().getRoleuser().equals("2"))) {
            return true;
        }

        return false;
    }
    
     public void addComment() {
        currComm.setDatecomm(java.util.Calendar.getInstance().getTime());
       if (!currComm.getText().equals("")) {
        if (commentService.add_Comment(currComm, curpublic, usrMB.getCurrentUser())) {  
           lstComm = commentService.getByPublication(curpublic);
           currComm.setText("");
        } else {
          //  JsfUtil.addSuccessMessage("I NE do it!");
        }
       }
       else {
           JsfUtil.addSuccessMessage("The comment is empty!");
       }
         
    }
     
       public void delComment() {
        Long id_c = new Long(id_comm);
        delComm = commentService.find(new Long(id_c));
        commentService.remove_Comment(delComm, curpublic, delComm.getAvtor());
         lstComm = commentService.getByPublication(curpublic);
        System.out.println(this.id_comm);
    }


    /** Creates a new instance of Article_CommentManagedBean */
    public Article_CommentManagedBean() {
    }
}

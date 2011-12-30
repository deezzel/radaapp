/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.UserService;
import java.io.IOException;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "userManagedBean")
@SessionScoped
public class UsersManagedBean {

    @EJB
    private UserService userService;
    private Users currentUser;
    private String login;
    private String password;
    private int role;

    
    public String getHello() {
        if (currentUser != null) {
            return "Welcome, " + currentUser.getLogin() + "!";
        }
        return null;
    }
    
    public String getLoginUserName()
    {
        Principal loginUser = getLoggedInUser();
        if (loginUser != null)
        {
            this.currentUser = userService.getByLogin(loginUser.getName());
            this.role = Integer.valueOf(currentUser.getRoleuser());
            return loginUser.getName();
        }
        return "Гость";
    }
    
     private Principal getLoggedInUser()
    {
        HttpServletRequest request =
                (HttpServletRequest) FacesContext.getCurrentInstance().
                    getExternalContext().getRequest();
        return request.getUserPrincipal();
    }

    public Users getCurrentUser() {
        return currentUser;
    }
    
    public boolean isSecretaryOrDeputatos (){
        if (currentUser!=null){
        if ((currentUser.getRoleuser().equals("2")) || (currentUser.getRoleuser().equals("3"))){
            return true;
        }
        }
        return false;
    }

//    public String getTest() {
//        if (null != userService.getUsr()) {
//            return userService.getUsr().getLogin();
//        } else {
//            return "NULL";
//        }
//    }

    public void checkPasswd()  {
       
        //if (userService.login(login, password)) {
           
                this.currentUser = userService.getByLogin(getLoginUserName());
               
                this.role = Integer.valueOf(currentUser.getRoleuser());
    
                login="";
                password="";
              try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/index.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
          
        
    }

    public void logout() {
        currentUser = null;
        HttpServletRequest request =
                (HttpServletRequest) FacesContext.getCurrentInstance().
                getExternalContext().getRequest();

        Principal loginUser = getLoggedInUser();
        if (loginUser != null)
        {
            HttpSession session = request.getSession(false);
            if (session != null)
            {
                session.invalidate();
                try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/index.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        
    }

    /* public List<String> getLogins() {
    return logins;
    }
    
    public List<String> getNames() {
    return names;
    }
    
    public List<String> getPasswords() {
    return passwords;
    }*/
    public String getLogin() {
        return login;
    }

    /* public void addInfo(ActionEvent actionEvent) {  
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sample info message", "PrimeFaces rocks!"));  
    }*/
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /** Creates a new instance of UsersManagedBean */
    public UsersManagedBean() {
    }

    /* public List<Users> getAllUsers() {
    return usersBean.getAllUsers();
    }*/
}

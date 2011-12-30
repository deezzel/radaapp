/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.JsfUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Julia
 */
@ManagedBean
@RequestScoped
public class LoginFailManagedBean {

    private boolean flag = true;

    public boolean getFlag() {
        return flag;
    }

    /** Crates a new instance of LoginFailManagedBean */
    public LoginFailManagedBean() {
        JsfUtil.addErrorMessage("Your password or login are not correct");
    }
}

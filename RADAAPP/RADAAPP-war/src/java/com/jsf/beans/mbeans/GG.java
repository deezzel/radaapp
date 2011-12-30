/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "GG")
public class GG {
 private String password;
    private String login;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    /** Creates a new instance of GG */
    public GG() {
    }
}

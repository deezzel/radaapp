/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import control.servicimplem.ProtocolService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Deputatos;
import model.Protocol;

/**
 *
 * @author Julia
 */
@ManagedBean (name ="depbyprotmb")
@RequestScoped
public class DeputByProtocolManagedBean {
    @EJB
    private ProtocolService protocolService;
    private Protocol currentProtocol;
    private List<Deputatos> lstDeputatos;

    public Protocol getCurrentProtocol() {
        return currentProtocol;
    }

    public void setCurrentProtocol(Protocol currentProtocol) {
        this.currentProtocol = currentProtocol;
    }

    public List<Deputatos> getLstDeputatos() {
        return lstDeputatos;
    }

    public void setLstDeputatos(List<Deputatos> lstDeputatos) {
        this.lstDeputatos = lstDeputatos;
    }
    
    
    
      @PostConstruct
    public void init() {
        String id_prot = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_prot");
        Long id = new Long(id_prot);
        try {
            currentProtocol = (Protocol) protocolService.find(Long.valueOf(id));
            lstDeputatos = protocolService.getDepbyProt(Long.valueOf(id));
      //      System.out.print("-------------------------------"+lstDeputatos.size());
                    
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    /** Creates a new instance of DeputByProtocolManagedBean */
    public DeputByProtocolManagedBean() {
    }
}

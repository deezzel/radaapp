/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.UserBase;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "deputatos", catalog = "rada", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login"})})
@XmlRootElement
@NamedQueries({
    //@NamedQuery(name = "Deputatos.findByShipment", query = "SELECT d FROM Deputatos d WHERE d.shipment = :shipment"),
    //@NamedQuery(name = "Deputatos.findAll", query = "SELECT d FROM Deputatos d"),
  //  @NamedQuery(name = "Deputatos.findById", query = "SELECT d FROM Deputatos d WHERE d.id = :id"),
   // @NamedQuery(name = "Deputatos.findByLogin", query = "SELECT d FROM Deputatos d WHERE d.login = :login"),
   // @NamedQuery(name = "Deputatos.findByName", query = "SELECT d FROM Deputatos d WHERE d.name = :name"),
   // @NamedQuery(name = "Deputatos.findByPassword", query = "SELECT d FROM Deputatos d WHERE d.password = :password"),
  //  @NamedQuery(name = "Deputatos.findBySecname", query = "SELECT d FROM Deputatos d WHERE d.secname = :secname"),
  //  @NamedQuery(name = "Deputatos.findByPatronymic", query = "SELECT d FROM Deputatos d WHERE d.patronymic = :patronymic"),
  //  @NamedQuery(name = "Deputatos.findByPhone", query = "SELECT d FROM Deputatos d WHERE d.phone = :phone")
})
public class Deputatos extends UserBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "deputat")
    private List<Protocol> protocolList;
//    @ManyToOne
//    @OneToMany(mappedBy = "avtor")
//    private List<Laws> lawsList;
    //////////////////////////
    @Transient
    private List<Comment> commList;
    //////////////////////

    public List<Comment> getCommList() {
        return commList;
    }

    public void setCommList(List<Comment> commList) {
        this.commList = commList;
    }
//
//    public void addLaw(Laws law) {
//        if (null != lawsList && null != law) {
//            lawsList.add(law);
//        } else {
//            //  
//        }
//    }
//
//    public void delLaw(Laws law) {
//        if (null != lawsList && null != law) {
//            lawsList.remove(law);
//        } else {
//            //  
//        }
//    }

    public void addProtoc(Protocol prot) {
        if (null != protocolList && null != prot) {
            protocolList.add(prot);
        } else {
            //  
        }
    }

    public void delProtoc(Protocol prot) {
        if (null != protocolList && null != prot) {
            protocolList.remove(prot);
        } else {
            //  
        }
    }

    public Deputatos() {
    }

    public Deputatos(Long id) {
        this.id = id;
    }

    public Deputatos(Long id, String login, String name, String password, String secname) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.secname = secname;
    }

    @XmlTransient
    public List<Protocol> getProtocolList() {
        return protocolList;
    }

    public void setProtocolList(List<Protocol> protocolList) {
        this.protocolList = protocolList;
    }

//    @XmlTransient
//    public List<Laws> getLawsList() {
//        return lawsList;
//    }
//
//    public void setLawsList(List<Laws> lawsList) {
//        this.lawsList = lawsList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deputatos)) {
            return false;
        }
        Deputatos other = (Deputatos) object;
        if (((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)))
                || ((this.login == null && other.login != null)
                || (this.login != null && !this.login.equals(other.login)))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Deputatos[ id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + " ]";
    }
}

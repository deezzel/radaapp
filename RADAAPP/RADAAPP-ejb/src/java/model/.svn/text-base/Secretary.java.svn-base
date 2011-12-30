/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.BaseEntity;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "secretary", catalog = "rada", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Secretary.findAll", query = "SELECT s FROM Secretary s"),
    @NamedQuery(name = "Secretary.findById", query = "SELECT s FROM Secretary s WHERE s.id = :id"),
    @NamedQuery(name = "Secretary.findByLogin", query = "SELECT s FROM Secretary s WHERE s.login = :login"),
    @NamedQuery(name = "Secretary.findByName", query = "SELECT s FROM Secretary s WHERE s.name = :name"),
    @NamedQuery(name = "Secretary.findByPassword", query = "SELECT s FROM Secretary s WHERE s.password = :password"),
    @NamedQuery(name = "Secretary.findBySecname", query = "SELECT s FROM Secretary s WHERE s.secname = :secname"),
    @NamedQuery(name = "Secretary.findByPatronymic", query = "SELECT s FROM Secretary s WHERE s.patronymic = :patronymic"),
    @NamedQuery(name = "Secretary.findByPhone", query = "SELECT s FROM Secretary s WHERE s.phone = :phone")})
public class Secretary extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "login", nullable = false, length = 25)
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Name", nullable = false, length = 25)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "password", nullable = false, length = 30)
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Secname", nullable = false, length = 30)
    private String secname;
    @Size(max = 35)
    @Column(name = "Patronymic", length = 35)
    private String patronymic;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "Phone", length = 30)
    private String phone;
    @OneToMany(mappedBy = "secretary")
    private List<Sessions> sessionsList;

    public void addSession(Sessions sess) {
        if (null != sessionsList && null != sess) {
            sessionsList.add(sess);
        } else {
            //  
        }
    }
    
    public void delSession(Sessions sess) {
        if (null != sessionsList && null != sess) {
            sessionsList.remove(sess);
        } else {
            //  
        }
    }

    public Secretary() {
    }

    public Secretary(Long id) {
        this.id = id;
    }

    public Secretary(Long id, String login, String name, String password, String secname) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.secname = secname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecname() {
        return secname;
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlTransient
    public List<Sessions> getSessionsList() {
        return sessionsList;
    }

    public void setSessionsList(List<Sessions> sessionsList) {
        this.sessionsList = sessionsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secretary)) {
            return false;
        }
        Secretary other = (Secretary) object;
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
        return "model.Secretary[ id=" + id + ", login=" + login + ", password=" + password + ", name" + name + " ]";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.UserBase;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "users", catalog = "rada", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id"),
    @NamedQuery(name = "Users.findByLogin", query = "SELECT u FROM Users u WHERE u.login = :login"),
    @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name"),
    //@NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findBySecname", query = "SELECT u FROM Users u WHERE u.secname = :secname"),
    @NamedQuery(name = "Users.findByPatronymic", query = "SELECT u FROM Users u WHERE u.patronymic = :patronymic"),
    @NamedQuery(name = "Users.findByPhone", query = "SELECT u FROM Users u WHERE u.phone = :phone")
// @NamedQuery(name = "Users.findByRoleuser", query = "SELECT u FROM Users u WHERE u.roleuser = :roleuser")
})
public class Users extends UserBase implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 15)
    @Column(name = "Role_user", nullable = false, length = 15)
    private String roleuser;
    @OneToMany(mappedBy = "avtor")
    private List<Protocol> protocolList;
    @OneToMany(mappedBy = "avtor")
    private List<Comment> commentList;
    @OneToMany(mappedBy = "avtor")
    private List<Publication> publicationList;
   // @OneToMany(mappedBy = "avtor")
  //  private List<Laws> lawsList;

//    @XmlTransient
//    public List<Laws> getLawsList() {
//        return lawsList;
//    }
//
//    public void setLawsList(List<Laws> lawsList) {
//        this.lawsList = lawsList;
//    }

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

    public void addPublication(Publication publ) {
        if (null != publicationList && null != publ) {
            publicationList.add(publ);
        } else {
            //  publicationList = new ArrayList<Publication>();
        }
    }

    public boolean delPublication(Publication publ) {
        if (null != publicationList && null != publ) {
            return publicationList.remove(publ);
        } else {
            return false;
        }
    }

    public void addComment(Comment comm) {
        if (null != commentList && null != comm) {
            commentList.add(comm);
        } else {
            // publicationList = new ArrayList<Publication>();
        }
    }

    public boolean delComment(Comment comm) {
        if (null != commentList && null != comm) {
            return commentList.remove(comm);
        } else {
            return false;
        }
    }

    public void addProtocol(Protocol prot) {
        if (null != protocolList && null != prot) {
            protocolList.add(prot);
        } else {
            // ppublicationList = new ArrayList<Publication>();
        }
    }

    public boolean delProtocol(Protocol prot) {
        if (null != protocolList && null != prot) {
            return protocolList.remove(prot);
        } else {
            return false;
        }
    }

    public Users() {
    }

    public Users(Long id) {
        this.id = id;
    }

    public Users(String login, String name, String password, String secname, String roleuser) {
        // this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.secname = secname;
        this.roleuser = roleuser;
    }

    public String getRoleuser() {
        return roleuser;
    }

    public void setRoleuser(String roleuser) {
        this.roleuser = roleuser;
    }

    @XmlTransient
    public List<Protocol> getProtocolList() {
        return protocolList;
    }

    public void setProtocolList(List<Protocol> protocolList) {
        this.protocolList = protocolList;
    }

    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @XmlTransient
    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
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
        return "model.Users[ id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + " ]";
    }
}

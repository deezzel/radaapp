/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import model.baseclass.BaseEntity;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "comment", catalog = "rada", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comment.findByPublic", query = "SELECT c FROM Comment c WHERE c.publication = :publication"),
    @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
    @NamedQuery(name = "Comment.findById", query = "SELECT c FROM Comment c WHERE c.id = :id"),
    @NamedQuery(name = "Comment.findByText", query = "SELECT c FROM Comment c WHERE c.text = :text"),
    @NamedQuery(name = "Comment.findByDatecomm", query = "SELECT c FROM Comment c WHERE c.datecomm = :datecomm")})
public class Comment extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
  //  @Basic(optional = false)
  //  @Size(min = 1, max = 200)
    @Column(name = "Text", nullable = false, length = 200)
    private String text;
    @Column(name = "Date_comm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecomm;
    @ManyToOne
    @JoinColumn(name = "Publication", referencedColumnName = "id")
    private Publication publication;
    @ManyToOne
    @JoinColumn(name = "Avtor", referencedColumnName = "id")
    private Users avtor;

    public Comment() {
    }

    public Comment(Long id) {
        this.id = id;
    }

    public Comment(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDatecomm() {
        return datecomm;
    }

    public void setDatecomm(Date datecomm) {
        this.datecomm = datecomm;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Users getAvtor() {
        return avtor;
    }

    public void setAvtor(Users avtor) {
        this.avtor = avtor;
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
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Comment[ id=" + id + ", text=" + text + ", date=" + datecomm + " ]";
    }
}

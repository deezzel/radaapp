/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.BaseEntity;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "publication", catalog = "rada", schema = "")
//@XmlRootElement
@NamedQueries({
   //   @NamedQuery(name = "Publication.findAll", query = "SELECT p FROM Publication p"),
    //@NamedQuery(name = "Publication.findIndex", query = "SELECT p FROM Publication p WHERE MATCH (p.text, p.title) AGAINST (:substr in boolean mode)"),
   //@NamedQuery(name = "Laws.findByText", query = "SELECT l FROM Laws l WHERE l.descript like '%:descript%' or l.title like '%:descript%'"),
   /*  @NamedQuery(name = "Publication.findText", query = "SELECT p FROM Publication p WHERE p.text like '%:text%' or p.title like '%:text%'"),
    @NamedQuery(name = "Publication.findByOrderDate", query = "SELECT p FROM Publication p ORDER BY p.date_publ"),
    @NamedQuery(name = "Publication.findByAvtor", query = "SELECT p FROM Publication p WHERE p.avtor = :avtor"),
    @NamedQuery(name = "Publication.findById", query = "SELECT p FROM Publication p WHERE p.id = :id"),
    @NamedQuery(name = "Publication.findByText", query = "SELECT p FROM Publication p WHERE p.text = :text"),
    @NamedQuery(name = "Publication.findByDate", query = "SELECT p FROM Publication p WHERE p.date_publ = :date_publ"),*/
    @NamedQuery(name = "Publication.findByType", query = "SELECT p FROM Publication p WHERE p.type = :type ORDER BY p.date_publ DESC")})
public class Publication extends BaseEntity implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Column(name = "Text", nullable = false)
    private String text;
    @Column(name = "Title", nullable = true, length = 255)
    private String title;
    @Column(name = "SubText", nullable = false, length = 255)
    private String subtext;
    @Column(name = "Date_publ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_publ;
   // @Size(min = 1, max = 15)
    @Column(name = "type", nullable = false, length = 15)
    private String type;
    @OneToMany(mappedBy = "publication", cascade={CascadeType.ALL})
    private List<Comment> commentList;
    @JoinColumn(name = "Avtor", referencedColumnName = "id")
    @ManyToOne
    private Users avtor;

    public void addComment(Comment comm) {
        if (null != commentList && null != comm) {
            commentList.add(comm);
        } else {
            //  
        }
    }

    public void delComment(Comment comm) {
        if (null != commentList && null != comm) {
            commentList.remove(comm);
        } else {
            //  
        }
    }

    public Publication() {
    }

    public Publication(Long id) {
        this.id = id;
    }

    public Publication(Long id, String text, String type) {
        this.id = id;
        this.text = text;
        this.type = type;
    }

    public Date getDate_publ() {
        return date_publ;
    }

    public void setDate_publ(Date date_publ) {
        this.date_publ = date_publ;
    }
    
    
     

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date_publ;
    }

    public void setDate(Date date) {
        this.date_publ = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Users getAvtor() {
        return avtor;
    }

    public void setAvtor(Users avtor) {
        this.avtor = avtor;
    }
    
    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(object instanceof Publication)) {
            return false;
        }
        Publication other = (Publication) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Publication[ id=" + id + ", type=" + type + ",  date=" + date_publ + " ]";
    }
}

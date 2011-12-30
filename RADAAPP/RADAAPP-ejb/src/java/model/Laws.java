/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.BaseEntity;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "laws", catalog = "rada", schema = "")
@XmlRootElement
@NamedQueries({
    
   @NamedQuery(name = "Laws.findBySession", query = "SELECT l FROM Laws l WHERE l.session = :session"),
        @NamedQuery(name = "Laws.findByNOTSession", query = "SELECT l FROM Laws l WHERE l.session != :session")
   // @NamedQuery(name = "Laws.findAll", query = "SELECT l FROM Laws l"),
    //@NamedQuery(name = "Laws.findById", query = "SELECT l FROM Laws l WHERE l.id = :id"),
    //@NamedQuery(name = "Laws.findByDescript", query = "SELECT l FROM Laws l WHERE l.descript = :descript"),
    //@NamedQuery(name = "Laws.findByTimeAccept", query = "SELECT l FROM Laws l WHERE l.timeAccept = :timeAccept"),
    //@NamedQuery(name = "Laws.findByTitle", query = "SELECT l FROM Laws l WHERE l.title = :title")
})
public class Laws extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    
    @Column(name = "Descript", nullable = false, length = 255)
    private String descript;
    @Basic(optional = false)
    
    @Column(name = "time_accept", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date timeAccept;
    @Basic(optional = false)
    @Column(name = "title", nullable = false, length = 30)
    private String title;
    @JoinColumn(name = "Session", referencedColumnName = "id")
    @ManyToOne
    private Sessions session;
    @JoinColumn(name = "avtor", referencedColumnName = "id")
    @ManyToOne
    private Users avtor;
    @JoinColumn (name ="decision", nullable=true)
    @OneToOne(mappedBy = "law", cascade= CascadeType.ALL)
    private Decision decision;

    public Laws() {
    }

    public Laws(Long id) {
        this.id = id;
    }

    public Laws(Long id, String descript, Date timeAccept, String title) {
        this.id = id;
        this.descript = descript;
        this.timeAccept = timeAccept;
        this.title = title;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Date getTimeAccept() {
        return timeAccept;
    }

    public void setTimeAccept(Date timeAccept) {
        this.timeAccept = timeAccept;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sessions getSession() {
        return session;
    }

    public void setSession(Sessions session) {
        this.session = session;
    }

    public Users getAvtor() {
        return avtor;
    }

    public void setAvtor(Users avtor) {
        this.avtor = avtor;
    }

    @XmlTransient
    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decisionList) {
        this.decision = decisionList;
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
        if (!(object instanceof Laws)) {
            return false;
        }
        Laws other = (Laws) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Laws[ id=" + id +", title="+ title + " ]";
    }
    
}

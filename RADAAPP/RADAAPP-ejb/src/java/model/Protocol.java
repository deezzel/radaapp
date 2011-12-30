/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "protocol", catalog = "rada", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Protocol.findBySession", query = "SELECT p FROM Protocol p WHERE p.session= :session"),
    @NamedQuery(name = "Protocol.findAll", query = "SELECT p FROM Protocol p"),
    @NamedQuery(name = "Protocol.findById", query = "SELECT p FROM Protocol p WHERE p.id = :id"),
    @NamedQuery(name = "Protocol.findByTimeWhenReg", query = "SELECT p FROM Protocol p WHERE p.timeWhenReg = :timeWhenReg")})
public class Protocol  extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @Basic(optional = false)
//    @NotNull
    @Column(name = "time_when_reg", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date timeWhenReg;
//    @Size(min = 1, max = 255)
    @Column(name = "Text_quest", nullable = false, length = 255)
    private String text;
    @JoinColumn(name = "Session", referencedColumnName = "id")
    @ManyToOne
    private Sessions session;
    @JoinColumn(name = "Deputat", referencedColumnName = "id")
    @ManyToOne
    private Users deputat;
    @JoinColumn(name = "avtor", referencedColumnName = "id")
    @ManyToOne
    private Users avtor;

    public Protocol() {
    }

    public Protocol(Long id) {
        this.id = id;
    }

    public Protocol(Long id, Date timeWhenReg) {
        this.id = id;
        this.timeWhenReg = timeWhenReg;
    }

    
    public Date getTimeWhenReg() {
        return timeWhenReg;
    }

    public void setTimeWhenReg(Date timeWhenReg) {
        this.timeWhenReg = timeWhenReg;
    }

    public Sessions getSession() {
        return session;
    }

    public void setSession(Sessions session) {
        this.session = session;
    }

    public Users getDeputat() {
        return deputat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDeputat(Users deputat) {
        this.deputat = deputat;
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
        if (!(object instanceof Protocol)) {
            return false;
        }
        Protocol other = (Protocol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Protocol[ id=" + id + ", question" + text + " ]";
    }
    
}

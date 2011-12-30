/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.BaseEntity;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "sessions", catalog = "rada", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sessions.findAll", query = "SELECT s FROM Sessions s"),
    @NamedQuery(name = "Sessions.findById", query = "SELECT s FROM Sessions s WHERE s.id = :id"),
    @NamedQuery(name = "Sessions.findByCountparticipants", query = "SELECT s FROM Sessions s WHERE s.countparticipants = :countparticipants"),
    @NamedQuery(name = "Sessions.findByTimeleadthrou", query = "SELECT s FROM Sessions s WHERE s.timeleadthrou = :timeleadthrou"),
    @NamedQuery(name = "Sessions.findByHeadsession", query = "SELECT s FROM Sessions s WHERE s.headsession = :headsession"),
    @NamedQuery(name = "Sessions.findByType", query = "SELECT s FROM Sessions s WHERE s.type = :type")
})
public class Sessions extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
   // @NotNull
    @Column(name = "Count_participants", nullable = false)
    private int countparticipants;
    @Basic(optional = false)
   // @NotNull
   // @Future
    @Column(name = "Time_leadthrou", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeleadthrou;
  //  @Size(max = 30)
    @Column(name = "Head_session", length = 30)
    private String headsession;
    @Basic(optional = false)
   // @NotNull
   // @Size(min = 1, max = 10)
    @Column(name = "type", nullable = false, length = 10)
    private String type;
    @OneToMany(mappedBy = "session", cascade=(CascadeType.ALL))
    private List<Protocol> protocolList;
    @JoinColumn(name = "Secretary", referencedColumnName = "id")
    @ManyToOne
    private Users secretary;
    @OneToMany(mappedBy = "session", cascade=(CascadeType.ALL))
    private List<Laws> lawsList;

    public void addLaw(Laws law) {
        if (null != lawsList && null != law) {
            lawsList.add(law);
        } else {
            //  
        }
    }

    public void delLaw(Laws law) {
        if (null != lawsList && null != law) {
            lawsList.remove(law);
        } else {
            //  
        }
    }

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

    public Sessions() {
    }

    public Sessions(Long id) {
        this.id = id;
    }

    public Sessions(Long id, int countparticipants, Date timeleadthrou, String type) {
        this.id = id;
        this.countparticipants = countparticipants;
        this.timeleadthrou = timeleadthrou;
        this.type = type;
    }

    public int getCountparticipants() {
        return countparticipants;
    }

    public void setCountparticipants(int countparticipants) {
        this.countparticipants = countparticipants;
    }

    public Date getTimeleadthrou() {
        return timeleadthrou;
    }

    public void setTimeleadthrou(Date timeleadthrou) {
        this.timeleadthrou = timeleadthrou;
    }

    public String getHeadsession() {
        return headsession;
    }

    public void setHeadsession(String headsession) {
        this.headsession = headsession;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public List<Protocol> getProtocolList() {
        return protocolList;
    }

    public void setProtocolList(List<Protocol> protocolList) {
        this.protocolList = protocolList;
    }

    public Users getSecretary() {
        return secretary;
    }

    public void setSecretary(Users secretary) {
        this.secretary = secretary;
    }

    @XmlTransient
    public List<Laws> getLawsList() {
        return lawsList;
    }

    public void setLawsList(List<Laws> lawsList) {
        this.lawsList = lawsList;
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
        if (!(object instanceof Sessions)) {
            return false;
        }
        Sessions other = (Sessions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sessions[ id=" + id + ", type=" + type + ", count_dep=" + countparticipants + ", time=" + timeleadthrou + " ]";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import model.baseclass.BaseEntity;

/**
 *
 * @author Julia
 */
@Entity
@Table(name = "decision", catalog = "rada", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Decision.findByLaw", query = "SELECT d FROM Decision d WHERE d.law = :law")
    //@NamedQuery(name = "Decision.findAll", query = "SELECT d FROM Decision d"),
   // @NamedQuery(name = "Decision.findById", query = "SELECT d FROM Decision d WHERE d.id = :id"),
   // @NamedQuery(name = "Decision.findByCntprotiv", query = "SELECT d FROM Decision d WHERE d.cntprotiv = :cntprotiv"),
   // @NamedQuery(name = "Decision.findByCntza", query = "SELECT d FROM Decision d WHERE d.cntza = :cntza"),
    //@NamedQuery(name = "Decision.findByDescript", query = "SELECT d FROM Decision d WHERE d.descript = :descript"),
    //@NamedQuery(name = "Decision.findByPopruvki", query = "SELECT d FROM Decision d WHERE d.popruvki = :popruvki")
})
public class Decision  extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    
    @Column(name = "Cnt_protiv", nullable = false)
    private int cntprotiv;
    @Basic(optional = false)
    
    @Column(name = "Cnt_za", nullable = false)
    private int cntza;
    @Basic(optional = false)
    
    @Column(name = "Descript", nullable = false, length = 255)
    private String descript;
    
    @Column(name = "Popruvki", length = 255)
    private String popruvki;
    @JoinColumn(name = "Law", referencedColumnName = "id")
    @OneToOne
    private Laws law;

    public Decision() {
    }

    public Decision(Long id) {
        this.id = id;
    }

    public Decision(Long id, int cntprotiv, int cntza, String descript) {
        this.id = id;
        this.cntprotiv = cntprotiv;
        this.cntza = cntza;
        this.descript = descript;
    }

    public int getCntprotiv() {
        return cntprotiv;
    }

    public void setCntprotiv(int cntprotiv) {
        this.cntprotiv = cntprotiv;
    }

    public int getCntza() {
        return cntza;
    }

    public void setCntza(int cntza) {
        this.cntza = cntza;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getPopruvki() {
        return popruvki;
    }

    public void setPopruvki(String popruvki) {
        this.popruvki = popruvki;
    }

    public Laws getLaw() {
        return law;
    }

    public void setLaw(Laws law) {
        this.law = law;
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
        if (!(object instanceof Decision)) {
            return false;
        }
        Decision other = (Decision) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Decision[ id=" + id + ", descript="+ descript +" ]";
    }
    
}

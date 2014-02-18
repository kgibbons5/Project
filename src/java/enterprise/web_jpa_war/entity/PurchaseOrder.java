/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Katie
 */
@Entity
@Table(name = "Purchase Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseOrder.findAll", query = "SELECT p FROM PurchaseOrder p"),
    @NamedQuery(name = "PurchaseOrder.findByPurID", query = "SELECT p FROM PurchaseOrder p WHERE p.purID = :purID"),
    @NamedQuery(name = "PurchaseOrder.findByAmoumt", query = "SELECT p FROM PurchaseOrder p WHERE p.amoumt = :amoumt"),
    @NamedQuery(name = "PurchaseOrder.findByPOrderID", query = "SELECT p FROM PurchaseOrder p WHERE p.pOrderID = :pOrderID")})
public class PurchaseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "purID")
    private Integer purID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amoumt")
    private Float amoumt;
    @Column(name = "pOrderID")
    private Integer pOrderID;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Integer purID) {
        this.purID = purID;
    }

    public Integer getPurID() {
        return purID;
    }

    public void setPurID(Integer purID) {
        this.purID = purID;
    }

    public Float getAmoumt() {
        return amoumt;
    }

    public void setAmoumt(Float amoumt) {
        this.amoumt = amoumt;
    }

    public Integer getPOrderID() {
        return pOrderID;
    }

    public void setPOrderID(Integer pOrderID) {
        this.pOrderID = pOrderID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purID != null ? purID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrder)) {
            return false;
        }
        PurchaseOrder other = (PurchaseOrder) object;
        if ((this.purID == null && other.purID != null) || (this.purID != null && !this.purID.equals(other.purID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.PurchaseOrder[ purID=" + purID + " ]";
    }
    
}

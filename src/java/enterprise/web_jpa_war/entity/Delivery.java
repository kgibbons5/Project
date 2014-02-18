/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Katie
 */
@Entity
@Table(name = "Delivery")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d"),
    @NamedQuery(name = "Delivery.findByInvoice", query = "SELECT d FROM Delivery d WHERE d.invoice = :invoice"),
    @NamedQuery(name = "Delivery.findByDelDate", query = "SELECT d FROM Delivery d WHERE d.delDate = :delDate"),
    @NamedQuery(name = "Delivery.findByPurID", query = "SELECT d FROM Delivery d WHERE d.purID = :purID")})
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "invoice")
    private Integer invoice;
    @Column(name = "delDate")
    @Temporal(TemporalType.DATE)
    private Date delDate;
    @Column(name = "purID")
    private Integer purID;

    public Delivery() {
    }

    public Delivery(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Date getDelDate() {
        return delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

    public Integer getPurID() {
        return purID;
    }

    public void setPurID(Integer purID) {
        this.purID = purID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoice != null ? invoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.invoice == null && other.invoice != null) || (this.invoice != null && !this.invoice.equals(other.invoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.Delivery[ invoice=" + invoice + " ]";
    }
    
}

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
@Table(name = "Sales Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesOrder.findAll", query = "SELECT s FROM SalesOrder s"),
    @NamedQuery(name = "SalesOrder.findByOrderID", query = "SELECT s FROM SalesOrder s WHERE s.orderID = :orderID"),
    @NamedQuery(name = "SalesOrder.findByCID", query = "SELECT s FROM SalesOrder s WHERE s.cID = :cID"),
    @NamedQuery(name = "SalesOrder.findByCartID", query = "SELECT s FROM SalesOrder s WHERE s.cartID = :cartID"),
    @NamedQuery(name = "SalesOrder.findByPrice", query = "SELECT s FROM SalesOrder s WHERE s.price = :price")})
public class SalesOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "orderID")
    private Integer orderID;
    @Column(name = "cID")
    private Integer cID;
    @Column(name = "cartID")
    private Integer cartID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;

    public SalesOrder() {
    }

    public SalesOrder(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getCID() {
        return cID;
    }

    public void setCID(Integer cID) {
        this.cID = cID;
    }

    public Integer getCartID() {
        return cartID;
    }

    public void setCartID(Integer cartID) {
        this.cartID = cartID;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOrder)) {
            return false;
        }
        SalesOrder other = (SalesOrder) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.SalesOrder[ orderID=" + orderID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Brian
 */
@Entity
@Table(name = "Buyer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buyer.findAll", query = "SELECT b FROM Buyer b"),
    @NamedQuery(name = "Buyer.findByid", query = "SELECT b FROM Buyer b WHERE b.id = :id"),
    @NamedQuery(name = "Buyer.findByCustomerId", query = "SELECT b FROM Buyer b WHERE b.customerId = :customerId"),
    @NamedQuery(name = "Buyer.findByAddress", query = "SELECT b FROM Buyer b WHERE b.address = :address"),
    @NamedQuery(name = "Buyer.findByCreditCard", query = "SELECT b FROM Buyer b WHERE b.creditCard = :creditCard"),
    @NamedQuery(name = "Buyer.findByPhoneNum", query = "SELECT b FROM Buyer b WHERE b.phoneNum = :phoneNum")})
public class Buyer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "customer_id")
    private String customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "creditCard")
    private String creditCard;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "phoneNum")
    private String phoneNum;

    public Buyer() {
    }

    public Buyer(Integer id) {
        this.id = id;
    }

    public Buyer(Integer id, String customerId, String address, String creditCard, String phoneNum) {
        this.id = id;
        this.customerId = customerId;
        this.address = address;
        this.creditCard = creditCard;
        this.phoneNum = phoneNum;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id= id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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
        if (!(object instanceof Buyer)) {
            return false;
        }
        Buyer other = (Buyer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Buyer[ id=" + id + " ]";
    }
    
}

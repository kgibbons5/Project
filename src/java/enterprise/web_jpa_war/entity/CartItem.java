/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Katie
 */
@Entity
@Table(name = "Cart Item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CartItem.findAll", query = "SELECT c FROM CartItem c"),
    @NamedQuery(name = "CartItem.findByItemCost", query = "SELECT c FROM CartItem c WHERE c.itemCost = :itemCost"),
    @NamedQuery(name = "CartItem.findByItemTotal", query = "SELECT c FROM CartItem c WHERE c.itemTotal = :itemTotal"),
    @NamedQuery(name = "CartItem.findByQuantity", query = "SELECT c FROM CartItem c WHERE c.quantity = :quantity"),
    @NamedQuery(name = "CartItem.findByPID", query = "SELECT c FROM CartItem c WHERE c.cartItemPK.pID = :pID"),
    @NamedQuery(name = "CartItem.findByCartID", query = "SELECT c FROM CartItem c WHERE c.cartItemPK.cartID = :cartID")})
public class CartItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CartItemPK cartItemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "itemCost")
    private Float itemCost;
    @Column(name = "itemTotal")
    private Float itemTotal;
    @Column(name = "quantity")
    private Integer quantity;

    public CartItem() {
    }

    public CartItem(CartItemPK cartItemPK) {
        this.cartItemPK = cartItemPK;
    }

    public CartItem(int pID, int cartID) {
        this.cartItemPK = new CartItemPK(pID, cartID);
    }

    public CartItemPK getCartItemPK() {
        return cartItemPK;
    }

    public void setCartItemPK(CartItemPK cartItemPK) {
        this.cartItemPK = cartItemPK;
    }

    public Float getItemCost() {
        return itemCost;
    }

    public void setItemCost(Float itemCost) {
        this.itemCost = itemCost;
    }

    public Float getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(Float itemTotal) {
        this.itemTotal = itemTotal;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartItemPK != null ? cartItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartItem)) {
            return false;
        }
        CartItem other = (CartItem) object;
        if ((this.cartItemPK == null && other.cartItemPK != null) || (this.cartItemPK != null && !this.cartItemPK.equals(other.cartItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.CartItem[ cartItemPK=" + cartItemPK + " ]";
    }
    
}

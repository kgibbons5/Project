/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Katie
 */
@Embeddable
public class CartItemPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "pID")
    private int pID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cartID")
    private int cartID;

    public CartItemPK() {
    }

    public CartItemPK(int pID, int cartID) {
        this.pID = pID;
        this.cartID = cartID;
    }

    public int getPID() {
        return pID;
    }

    public void setPID(int pID) {
        this.pID = pID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pID;
        hash += (int) cartID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartItemPK)) {
            return false;
        }
        CartItemPK other = (CartItemPK) object;
        if (this.pID != other.pID) {
            return false;
        }
        if (this.cartID != other.cartID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.CartItemPK[ pID=" + pID + ", cartID=" + cartID + " ]";
    }
    
}

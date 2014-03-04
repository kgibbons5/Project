package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Katie
 */
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @Column(name = "cID")
    private String id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
     @Column(name = "password")
    private String password;
    
    
    //Creates a new instance of Customer
    public Customer() {
    }

    public Customer(String id, String name, String email, String password) {
        this.id = id;
        this.name=name;
        this.email = email;
        this.password = password;
    }
public void setId(String i) {
        this.id=i;
    }
    public String getId() {
        return this.id;
    }

    
     public String name() {
        return this.name;
    }
     public String getEmail() {
        return this.email;
    }
    
      public String getPassword() {
        return this.password;
    }

    
    public void Name(String fname) {
        this.name=fname;
    }
     public String getName(String fname) {
        return this.name;
    }

    public void setEmail(String email) {
       this.email=email;
    }
    public void setName(String n) {
       this.email=n;
    }

    public void setPhone(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCityRegion(String cityRegion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCcNumber(String ccNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

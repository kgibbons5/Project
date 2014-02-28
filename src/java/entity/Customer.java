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

    @Column(name = "sname")
    private String surName;

    @Column(name = "fname")
    private String firstName;
    
    @Column(name = "email")
    private String email;
    
     @Column(name = "password")
    private String password;
    
    
    //Creates a new instance of Customer
    public Customer() {
    }

    public Customer(String id, String firstName, String surName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.surName  = surName;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return this.id;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
     public String getEmail() {
        return this.email;
    }
    
      public String getPassword() {
        return this.password;
    }
}

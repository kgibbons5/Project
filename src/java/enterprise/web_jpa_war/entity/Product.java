package enterprise.web_jpa_war.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Katie
 */
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "pID")
    private String id;

    @Column(name = "pName")
    private String name;

    @Column(name = "genre")
    private String genre;
    
    @Column(name = "stock")
    private String stock;
    
     @Column(name = "pPrice")
    private String price;
     
     @Column(name = "image")
    private String img;
     
     @Column(name = "description")
    private String des;
    
    
    //Creates a new instance of Customer
    public Product() {
    }

    public Product(String id, String name, String genre, String stock, String price, String img, String des) {
        this.id = id;
        this.name = name;
        this.genre  = genre;
        this.stock  = stock;
        this.price = price;
        this.img = img;
        this.des = des;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }
    
     public String getStock() {
        return this.stock;
    }
    
      public String getPrice() {
        return this.price;
    }
      
      public String getImg() {
        return this.img;
    }
      
      public String getDes() {
        return this.des;
    }
}

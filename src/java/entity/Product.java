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
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "pID")
    private int id;

    @Column(name = "pName")
    private String name;

    @Column(name = "genre")
    private String genre;
    
    @Column(name = "stock")
    private String stock;
    
     @Column(name = "pPrice")
    private float price;
     
     @Column(name = "image")
    private String img;
     
     @Column(name = "description")
    private String des;
     
     @Column(name = "category_id")
    private int cid;
    
    
    //Creates a new instance of Customer
    public Product() {
    }

    public Product(int id, String name, String genre, String stock, float price, String img, String des, int cid) {
        this.id = id;
        this.name = name;
        this.genre  = genre;
        this.stock  = stock;
        this.price = price;
        this.img = img;
        this.des = des;
        this.cid = cid;
    }

    public int getId() {
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

    /**
     *
     * @return
     */
    public float getPrice() {
        return this.price;
    }
      
      public String getImg() {
        return this.img;
    }
      
      public String getDes() {
        return this.des;
    }
      
      public int getCid() {
        return this.cid;
    }
      
}

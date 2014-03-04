/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;
import entity.*;
import java.util.*;
import cart.*;
import java.math.BigDecimal;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Brian
 */
@Stateless
public class OrderManager {

    @PersistenceContext(unitName = "web-jpaPU")
    private EntityManager em;
    @Resource
    private SessionContext context;
    @EJB
    private ProductFacade productFacade;
    @EJB
    private CustomerOrderFacade customerOrderFacade;
    @EJB
    private OrderedProductFacade orderedProductFacade;
    public int placeOrder(String user, String address, String phone, String ccNumber, Cart cart) 
    {
        Buyer customer=addCustomer(user,address,phone,ccNumber);
        CustomerOrder order =addOrder(customer,cart);
        addOrderedItems(order,cart);
        return order.getId();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private Buyer addCustomer(String user, String address, String phone, String ccNumber) 
    {
        Buyer customer =new Buyer();
        customer.setCustomerId(user);
        customer.setAddress(address);
        customer.setPhoneNum(phone);
        customer.setCreditCard(ccNumber);
        em.persist(customer);
        return customer;
    }

    private CustomerOrder addOrder(Buyer customer, Cart cart) 
    {
        CustomerOrder order=new CustomerOrder();
        order.setCustomer(customer);
        order.setAmount(BigDecimal.valueOf(cart.getTotal()));
        
        Random random =new Random();
        int i=random.nextInt(999999999);
        order.setConfirmationNumber(i);
         em.persist(order);
        return order;
    }

    private void addOrderedItems(CustomerOrder order, Cart cart) 
    {
        {
        
            em.flush();
        List<CartItem> items = cart.getItems();

        // iterate through shopping cart and create OrderedProducts
        for (CartItem scItem : items) 
        {

            int productId = scItem.getProduct().getId();

            // set up primary key object
            OrderedProductPK orderedProductPK = new OrderedProductPK();
            orderedProductPK.setCustomerOrderId(order.getId());
            orderedProductPK.setProductId(productId);

            // create ordered item using PK object
            OrderedProduct orderedItem = new OrderedProduct(orderedProductPK);

            // set quantity
            orderedItem.setQuantity(scItem.getQuantity());
            em.persist(orderedItem);
        }
      }
    }
    public Map getOrderDetails(int orderId) {

        Map orderMap = new HashMap();

        // get order
        CustomerOrder order = customerOrderFacade.find(orderId);

        // get customer
        Buyer customer = order.getCustomer();

        // get all ordered products
        List<OrderedProduct> orderedProducts = orderedProductFacade.findByOrderId(orderId);

        // get product details for ordered items
        List<Product> products = new ArrayList<Product>();

        for (OrderedProduct op : orderedProducts) {

            Product p = (Product) productFacade.find(op.getOrderedProductPK().getProductId());
            products.add(p);
        }

        // add each item to orderMap
        orderMap.put("orderRecord", order);
        orderMap.put("customer", customer);
        orderMap.put("orderedProducts", orderedProducts);
        orderMap.put("products", products);

        return orderMap;
    }
      
}

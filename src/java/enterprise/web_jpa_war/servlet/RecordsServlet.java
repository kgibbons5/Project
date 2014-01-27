/*package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.Customer;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.annotation.Resource;
import javax.transaction.UserTransaction;

@WebServlet(name="RecordsServlet", loadOnStartup = 1, urlPatterns={"/Register"})
public class RecordsServlet extends HttpServlet {
    
    @PersistenceUnit
    //The emf corresponding to 
    private EntityManagerFactory emf;  
    
    @Resource
    private UserTransaction utx;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException {
        assert emf != null;  //Make sure injection went through correctly.
        EntityManager em = null;
        try {
         
                Customer cust1= new Customer("007","James","Bond","MI5@hotmail.com","skyfall");
                Customer cust2= new Customer("batman","Bruce","Wayne","batman@gmail.com","gotham");
                Customer cust3= new Customer("heisenberg","Walter","White","heisenberg@gmail.com","meth");
                Customer cust4= new Customer("keano","Roy","Keane","keano@yahoo.co.uk","Triggs");

                //begin a transaction
                utx.begin();
                //create an em. 
                //Since the em is created inside a transaction, it is associsated with 
                //the transaction
                em = emf.createEntityManager();
                //persist the person entity
                em.persist(cust1);
                //commit transaction which will trigger the em to 
                //commit newly created entity into database
                utx.commit();
                request.getRequestDispatcher("register.jsp").forward(request, response);
               
            }
           catch (Exception ex) {
            throw new ServletException(ex);
        } finally {
            //close the em to release any resources held up by the persistebce provider
            if(em != null) {
                em.close();
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    public String getServletInfo() {
        return "Short description";
    }
    
    // </editor-fold>
}
*/
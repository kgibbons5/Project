package enterprise.web_jpa_war.servlet;

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



 // sevelet class to insert Customer into database
 
@WebServlet(name="RegisterServlet", urlPatterns={"/Register"})
public class RegisterServlet extends HttpServlet {
    
    @PersistenceUnit
    //The emf corresponding to 
    private EntityManagerFactory emf;  
    
    @Resource
    private UserTransaction utx;

    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException {
        assert emf != null;  //Make sure injection went through correctly.
        EntityManager em = null;
       String errormsg1="", errormsg2="", errormsg3="", errormsg4="", errormsg5="";
        try {
            
            //Get the data from user's form
            String id         = (String) request.getParameter("id");
            String firstName  = (String) request.getParameter("firstName");
            String surName   = (String) request.getParameter("surName");
            String email      = (String) request.getParameter("email");
            String password   = (String) request.getParameter("password");
            
            boolean error = false;
            
            if(id == null || id.equals(""))
            {
                errormsg1 ="User ID can't be null or empty";
                error=true;
            }
            if(firstName == null || firstName.equals(""))
            {
                errormsg2 = "FirstName can't be null or empty";
                error=true;
            }
            if(surName == null || surName.equals(""))
            {
                errormsg3 ="SurName Email can't be null or empty";
                error=true;
            }
            if(email == null || email.equals(""))
            {
                errormsg4 = "Email can't be null or empty";
                error=true;
            }
            if(password == null || password.equals(""))
            {
                errormsg5 = "Password can't be null or empty";
                error=true;
            }
            
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/regFail.jsp");
                PrintWriter out= response.getWriter();
                
            if(error)
            {
                out.println("<center><img src=\"http://blog.extreme-advice.com/wp-content/uploads/2013/01/error.png\" alt=\"error\" height=\"40%\" width=\"20%\">");
                out.println("<center><font size = \"4\" color=\"#151B54\"><h2>Registration Failed!</h2>");
            }
                
            if(errormsg1 != "")
            {
                out.println("<center><p><font color=red>"+errormsg1+"</font><p></center>");
            }
            if(errormsg2 != "")
            {
                out.println("<center><p><font color=red>"+errormsg2+"</font></p></center>");
            }
            if(errormsg3 != "")
            {
                out.println("<center><p><font color=red>"+errormsg3+"</font></p></center>");
            }
            if(errormsg4 != "")
            {
                out.println("<center><p><font color=red>"+errormsg4+"</font></p></center>");
            }
            if(errormsg5 != "")
            {
                out.println("<center><p><font color=red>"+errormsg5+"</font></p></center>");
            }
            if(error)
            {
            out.println("<center><a href=\"register.jsp\"><strong><h3>Click Here to Try Again!</h3></strong></a>");
            }
            
            rd.include(request, response);
            
            if((errormsg1 == "")&&(errormsg2 == "")&&(errormsg3 == "")&&(errormsg4 == "")&&(errormsg5 == ""))
            {
                //Create a person instance out of it
                Customer customer = new Customer(id, firstName, surName, email,password);

                //begin a transaction
                utx.begin();
                //create an em. 
                //Since the em is created inside a transaction, it is associsated with 
                //the transaction
                em = emf.createEntityManager();
                //persist the person entity
                em.persist(customer);
                //commit transaction which will trigger the em to 
                //commit newly created entity into database
                utx.commit();

                //Reg success
                request.getRequestDispatcher("regSuccess.jsp").forward(request, response);
            }
            
            
        } catch (Exception ex) {
            throw new ServletException(ex);
        } finally {
            //close the em to release any resources held up by the persistebce provider
            if(em != null) {
                em.close();
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
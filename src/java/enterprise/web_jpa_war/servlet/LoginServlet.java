/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Katie
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://danu6.it.nuigalway.ie/mydb1253","mydb1253gk","lu9syq");

            String sql="Select * from Customer";
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            String inputId         = (String) request.getParameter("id");
            String inputPassword   = (String) request.getParameter("password");
            int tmp=0;
            
            while(rs.next()) 
            {
                String uname = rs.getString("cID");
                //Username is the coloumn name in the database table 
                String pass = rs.getString("password");
                if ((inputId.equals(uname)) && (inputPassword.equals(pass))) 
                {
                    RequestDispatcher pd = getServletContext().getRequestDispatcher("/logSuccess.jsp");
                    pd.include(request, response);
                    tmp++;
                }
            }
            if (tmp==0) 
            {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/logFail.jsp");
                rd.include(request, response);
            }
          
        } catch (Exception e){}
        
        finally {
                    out.close();
                }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.Product;
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

@WebServlet(name = "BrowseServlet", urlPatterns = {"/Browse"})
public class BrowseServlet extends HttpServlet {

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
    throws ServletException, IOException, ClassNotFoundException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://danu6.it.nuigalway.ie/mydb1253","mydb1253gk","lu9syq");

            String gen="Drama";
            String sql = "Select * from Product where genre = '"+gen+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int tmp = 0;
            
            while(rs.next()) 
            {
                String name = rs.getString("pName");
                String genre = rs.getString("genre");
                String price = rs.getString("pPrice");
                String img = rs.getString("image");
                String des = rs.getString("description");
                
                RequestDispatcher pd = getServletContext().getRequestDispatcher("/genre.jsp");
                pd.include(request, response);
                
                pw= response.getWriter();
                
                pw.println("<div id=\"browsecolumn\">"); 
                pw.println("<table id=\"productTable\">"); 
                pw.println("<tr>"); 
                pw.println("<td class=\"lightBlue\">"); 
                pw.println("<img src=\""+img+"\" alt=\"image\" height=\"100px\" width=\"70px\"/>"); 
                pw.println("</td>"); 
                pw.println("<td class=\"lightBlue\">"); 
                pw.println("<strong>"+name+"</strong>"); 
                pw.println("<br>"); 
                pw.println("<span class=\"smallText\"><p>"+des+"</p><br></span>"); 
                pw.println("</td>"); 
                pw.println("<td class=\"lightBlue\"><pre>"+price+"</pre></td>"); 
                pw.println("<td class=\"lightBlue\">"); 
                pw.println("<form action=\"#\" method=\"post\">"); 
                pw.println("<input type=\"submit\" value=\"purchase button\">"); 
                pw.println("</form>"); 
                pw.println("</td>"); 
                pw.println("</tr>");
                pw.println("</table>"); 
                pw.println("</div>"); 
                
                /*pw.println("<div id=\"footer\">");
                pw.println("This is the Footer"); 
                pw.println("</div>");*/
                
            }
        } 
        
        catch (Exception e){
        }
        
        finally {
            pw.close();
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
}

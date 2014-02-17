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

@WebServlet(name = "SearchServlet", urlPatterns = {"/Search"})
public class SearchServlet extends HttpServlet {

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
        
        boolean found=false;
        String search = (String) request.getParameter("searchInput");
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://danu6.it.nuigalway.ie/mydb1253","mydb1253gk","lu9syq");

            String sql = "Select * from Product";
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
                
                if((name.toUpperCase()).equals(search.toUpperCase()))
                {
                RequestDispatcher pd = getServletContext().getRequestDispatcher("/search.jsp");
                pd.include(request, response);
                
                pw= response.getWriter();
                
                pw.println("<div id=\"wrapper\">"); 
                pw.println("<div id=\"header\">"); 
                pw.println("<a href=\"#\"><img src=\"http://s25.postimg.org/fdz8rlb9b/dvdeals.gif\" id=\"logo\" height=\"100%\" width=\"20%\"></a>"); 
                pw.println("<a href=\"index.jsp\"><input type=\"submit\" id=\"logout\" value=\"Logout\"/></a>");
                pw.println("<div id =  \"cart\">"); 
                pw.println("<a href=\"#\"><img src=\"http://www.buffalochamber.org/images/shopping_cart.png\" id=\"cart\" height=\"15%\" width=\"15%\"></a>"); 
                pw.println("</div>"); 
                pw.println("</div>");
                
                pw.println("<div id=\"navigation\">"); 
                pw.println("<div class=\"tabs\">"); 
                pw.println("<font color=\"white\">"); 
                pw.println("<strong>"); 
                pw.println("<a data-toggle=\"tab2\">Drama</a>"); 
                pw.println("<a data-toggle=\"tab3\">Sci-Fi</a>"); 
                pw.println("<a data-toggle=\"tab4\">BoxSets</a>"); 
                pw.println("<a data-toggle=\"tab5\">Action</a>"); 
                pw.println("<a data-toggle=\"tab5\">Horror</a>"); 
                pw.println("<a data-toggle=\"tab5\">Childrens</a>"); 
                pw.println("<a data-toggle=\"tab5\">Thriller</a>"); 
                pw.println("<a data-toggle=\"tab5\">Romance</a>"); 
                pw.println("</strong>"); 
                pw.println("</font>"); 
                pw.println("</div>");
                pw.println("<div id=\"tfnewsearch\">"); 
                pw.println("<form id=\"tfnewsearch\" action=\"Search\" method=\"post\">");
                pw.println("<input type=\"text\" class=\"tftextinput\" name=\"searchInput\" size=\"21\" maxlength=\"120\"><input type=\"submit\"\n" +
                           "value=\"search\" class=\"tfbutton\">"); 
                pw.println("</form>"); 
                pw.println("</div>"); 
                pw.println(" </div>");
                
                pw.println(" <div id=\"leftcolumn\"> "); 
                pw.println("<div id=\"categories\">"); 
                pw.println("<div id=\"categories_header\">"); 
                pw.println("<h2>Categories</h2>"); 
                pw.println("</div>"); 
                pw.println("<ul>"); 
                pw.println("<li><a href=\"comedy.jsp\">Comedy</a></li>"); 
                pw.println("<li><a href=\"drama.jsp\">Drama</a></li>"); 
                pw.println("<li><a href=\"sci-fi.jsp\">Sci-Fi</a></li>"); 
                pw.println("<li><a href=\"boxset.jsp\">BoxSets</a></li>"); 
                pw.println("<li><a href=\"action.jsp\">Action</a></li>"); 
                pw.println("<li><a href=\"horror.jsp\">Horror</a></li>"); 
                pw.println("<li><a href=\"children.jsp\">Childrens</a></li>"); 
                pw.println("<li><a href=\"thriller.jsp\">Thriller</a></li>"); 
                pw.println("<li class=\"last\"><a href=\"romance.jsp\">Romance</a></li>"); 
                pw.println("</ul>"); 
                pw.println("<div class=\"clearthis\">&nbsp;</div>"); 
                pw.println("</div>"); 
                pw.println("</div>"); 
                
                pw.println("<div id=\"browsecolumn\">"); 
                pw.println("<center><strong><h2>Search Results for \""+search+"\"...</h2></strong></center>");
                pw.println("<table id=\"productTable\">"); 
                pw.println("<tr>"); 
                pw.println("<td class=\"lightBlue\">"); 
                pw.println("<img src=\""+img+"\" alt=\"image\" height=\"100px\" width=\"70px\"/>"); 
                pw.println("</td>"); 
                pw.println("<td class=\"lightBlue\">"); 
                pw.println("<strong>"+name+"</strong>"); 
                pw.println("<br>"); 
                pw.println("</td>"); 
                pw.println("<td class=\"lightBlue\"><pre>"+price+"</pre></td>"); 
                pw.println("<td class=\"lightBlue\">"); 
                pw.println("<form action=\"#\" method=\"post\">"); 
                pw.println("<input type=\"submit\" value=\"View Product\">"); 
                pw.println("</form>"); 
                pw.println("</td>"); 
                pw.println("</tr>");
                pw.println("</table>"); 
                pw.println("</div>"); 
                
                /*pw.println("<div id=\"footer\">");
                pw.println("This is the Footer"); 
                pw.println("</div>");*/
                
                found=true;
                } 
            }
            
             if(!found)
             {
                RequestDispatcher pd = getServletContext().getRequestDispatcher("/search.jsp");
                pd.include(request, response);
                
                pw= response.getWriter();
                
                pw.println("<div id=\"wrapper\">"); 
                pw.println("<div id=\"header\">"); 
                pw.println("<a href=\"#\"><img src=\"http://s25.postimg.org/fdz8rlb9b/dvdeals.gif\" id=\"logo\" height=\"100%\" width=\"20%\"></a>"); 
                pw.println("<a href=\"index.jsp\"><input type=\"submit\" id=\"logout\" value=\"Logout\"/></a>");
                pw.println("<div id =  \"cart\">"); 
                pw.println("<a href=\"#\"><img src=\"http://www.buffalochamber.org/images/shopping_cart.png\" id=\"cart\" height=\"15%\" width=\"15%\"></a>"); 
                pw.println("</div>"); 
                pw.println("</div>");
                
                pw.println("<div id=\"navigation\">"); 
                pw.println("<div class=\"tabs\">"); 
                pw.println("<font color=\"white\">"); 
                pw.println("<strong>"); 
                pw.println("<a data-toggle=\"tab2\">Drama</a>"); 
                pw.println("<a data-toggle=\"tab3\">Sci-Fi</a>"); 
                pw.println("<a data-toggle=\"tab4\">BoxSets</a>"); 
                pw.println("<a data-toggle=\"tab5\">Action</a>"); 
                pw.println("<a data-toggle=\"tab5\">Horror</a>"); 
                pw.println("<a data-toggle=\"tab5\">Childrens</a>"); 
                pw.println("<a data-toggle=\"tab5\">Thriller</a>"); 
                pw.println("<a data-toggle=\"tab5\">Romance</a>"); 
                pw.println("</strong>"); 
                pw.println("</font>"); 
                pw.println("</div>");
                pw.println("<div id=\"tfnewsearch\">"); 
                pw.println("<form id=\"tfnewsearch\" action=\"Search\" method=\"post\">");
                pw.println("<input type=\"text\" class=\"tftextinput\" name=\"searchInput\" size=\"21\" maxlength=\"120\"><input type=\"submit\"\n" +
                           "value=\"search\" class=\"tfbutton\">"); 
                pw.println("</form>"); 
                pw.println("</div>"); 
                pw.println(" </div>"); 
                
                pw.println(" <div id=\"leftcolumn\"> "); 
                pw.println("<div id=\"categories\">"); 
                pw.println("<div id=\"categories_header\">"); 
                pw.println("<h2>Categories</h2>"); 
                pw.println("</div>"); 
                pw.println("<ul>"); 
                pw.println("<li><a href=\"comedy.jsp\">Comedy</a></li>"); 
                pw.println("<li><a href=\"drama.jsp\">Drama</a></li>"); 
                pw.println("<li><a href=\"sci-fi.jsp\">Sci-Fi</a></li>"); 
                pw.println("<li><a href=\"boxset.jsp\">BoxSets</a></li>"); 
                pw.println("<li><a href=\"action.jsp\">Action</a></li>"); 
                pw.println("<li><a href=\"horror.jsp\">Horror</a></li>"); 
                pw.println("<li><a href=\"children.jsp\">Childrens</a></li>"); 
                pw.println("<li><a href=\"thriller.jsp\">Thriller</a></li>"); 
                pw.println("<li class=\"last\"><a href=\"romance.jsp\">Romance</a></li>"); 
                pw.println("</ul>"); 
                pw.println("<div class=\"clearthis\">&nbsp;</div>"); 
                pw.println("</div>"); 
                pw.println("</div>"); 
                
                pw.println("<div id=\"browsecolumn\">"); 
                pw.println("<center><h2>"); 
                pw.println("No search result could be found for \""+search+"\"<table id=\"productTable\"><br>");
                pw.println("<a href=\"logSuccess.jsp\"><strong>Return to Homepage</strong></a>");
                pw.println("</h2></center>"); 
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

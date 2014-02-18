<%-- 
    Document   : checkout
    Created on : 17-Feb-2014, 16:03:48
    Author     : Katie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <!-- Begin Navigation -->
 <div id="navigation"> 
 <div class="tabs">
     <font color="white">
     <strong>
   <a data-toggle="tab2">Drama</a>
   <a data-toggle="tab3">Sci-Fi</a>
   <a data-toggle="tab4">BoxSets</a>
   <a data-toggle="tab5">Action</a>
<a data-toggle="tab5">Horror</a>
<a data-toggle="tab5">Childrens</a>
<a data-toggle="tab5">Thriller</a>
<a data-toggle="tab5">Romance</a>
    </strong>
    </font>
 </div>
 <div id="tfnewsearch">
 
 <form id="tfnewsearch" method="get" action="http://www.google.com">
       <input type="text" class="tftextinput" name="q" size="21" maxlength="120"><input type="submit" value="search" class="tfbutton">
</form>
 
 </div>
    
 </div>
 
 <div id="leftcolumn"> 
 <div id="categories">
     <div id="categories_header">
       
       <h2>Categories</h2>
     </div>
     <ul>
       <li><a href="browse.jsp">Comedy</a></li>
       <li><a href="browse.jsp">Drama</a></li>
       <li><a href="browse.jsp">Sci-Fi</a></li>
       <li><a href="browse.jsp">BoxSets</a></li>
       <li><a href="browse.jsp">Action</a></li>
       <li><a href="browse.jsp">Horror</a></li>
       <li><a href="browse.jsp">Childrens</a></li>
       <li><a href="browse.jsp">Thriller</a></li>
       <li class="last"><a href="browse.jsp">Romance</a></li>
     </ul>
     <div class="clearthis">&nbsp;</div>
   </div>
 
 </div>
 <!-- End Left Column -->
 <!-- Begin Left Middle Column -->
 <div id="browsecolumn"> 
 <!-- End Right Column -->
 <!-- Begin Footer -->
 </div>
    </body>
</html>

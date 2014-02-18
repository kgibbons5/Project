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
        <title>Category</title>
    </head>
    <body>
         <!-- Begin Navigation -->
 <div id="navigation"> 
 <div class="tabs">
     <font color="white">
    <strong>
   <a data-toggle="tab1" href="comedy.jsp">Comedy</a>
   <a data-toggle="tab2"href="drama.jsp">Drama</a>
   <a data-toggle="tab3"href="sci-fi.jsp">Sci-Fi</a>
   <a data-toggle="tab4"href="boxset.jsp">BoxSets</a>
   <a data-toggle="tab5"href="action.jsp">Action</a>
   <a data-toggle="tab6"href="horror.jsp">Horror</a>
   <a data-toggle="tab7"href="children.jsp">Childrens</a>
   <a data-toggle="tab8"href="thriller.jsp">Thriller</a>
   <a data-toggle="tab9"href="romance.jsp">Romance</a>
    </strong>
    </font>
 </div>
 <div id="tfnewsearch">
 
 <form id="tfnewsearch" action="Search" method="post">
       <input type="text" class="tftextinput" name="searchInput" size="21" maxlength="120"><input type="submit"
  value="search" class="tfbutton">
</form>
 </div>
    
 </div>
 <!-- End Navigation -->
 <!-- Begin Left Column -->
 <div id="leftcolumn"> 
 <div id="categories">
     <div id="categories_header">
       
       <h2>Categories</h2>
     </div>
     <ul>
       <li><a href="comedy.jsp">Comedy</a></li>
       <li><a href="drama.jsp">Drama</a></li>
       <li><a href="sci-fi.jsp">Sci-Fi</a></li>
       <li><a href="boxset.jsp">BoxSets</a></li>
       <li><a href="action.jsp">Action</a></li>
       <li><a href="horror.jsp">Horror</a></li>
       <li><a href="children.jsp">Childrens</a></li>
       <li><a href="thriller.jsp">Thriller</a></li>
       <li class="last"><a href="romance.jsp">Romance</a></li>
     </ul>
     <div class="clearthis">&nbsp;</div>
   </div>
 
 </div>
 <!-- End Left Column -->
 <!-- Begin Left Middle Column -->
 <div id="leftmiddle"> 
 <div class="DramaBox">
               <a href="drama.jsp"> 
               <span class="categoryLabelText">Drama
               </span>
               </a>
           </div>

<div class="KidsBox">
                
                   <a href="children.jsp">
                   <span class="categoryLabelText">Kids</span>
                   </a>
                   
              </div>
  
  <div class="RomanceBox">
                
                   <a href="romance.jsp">
                   <span class="categoryLabelText">Romance</span>
                   </a>
                   
              </div>
 </div>
 <!-- End Left Middle Column -->
 <!-- Begin Right Middle Column -->
 <div id="rightmiddle"> 

 <div class="ThrillerBox">
                
                   <a href="thriller.jsp">
                   <span class="categoryLabelText">Thriller</span>
                   </a>
                   
              </div>

 <div class="SciBox">
                
                   <a href="sci-fi.jsp">
                   <span class="categoryLabelText">Sci-Fi</span>
                   </a>
                   
              </div>
           
           <div class="HorrorBox">
                
                   <a href="horror.jsp">
                   <span class="categoryLabelText">Horror</span>
                   </a>
                   
              </div>

 </div>
 <!-- End Right Middle Column -->
 <!-- Begin Right Column -->
 <div id="rightcolumn"> 
 <div class="ComedyBox">
                
                   <a href="comedy.jsp">
                   <span class="categoryLabelText">Comedy</span>
                   </a>
                   
              </div>

 <div class="ActionBox">
                
                   <a href="action.jsp">
                   <span class="categoryLabelText">Action</span>
                   </a>
                   
              </div>
           
           <div class="BoxSetBox">
                
                   <a href="boxset.jsp">
                   <span class="categoryLabelText">BoxSets</span>
                   </a>
                   
              </div>
  
 
 </div>
 <!-- End Right Column -->


<!-- End Wrapper -->
</body>
</html>
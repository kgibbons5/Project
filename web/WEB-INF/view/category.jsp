<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<sql:query var="categories" dataSource="jdbc/Project">
    SELECT * FROM Category
</sql:query>


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
 <div id="cat">
     <div id="cat_header">
       
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
 <div id="browsecolumn"> 
     
     <c:forEach var="category" items="${categories.rows}">
         
         <div class="DvdBox">
                        <a href="category?${category.id}">

                            <span class="catLabelText">${category.genre}</span>

                            <img src="${initParam.categoryImagePath}${category.genre}.jpg"
                                 alt="${category.genre}">
                        </a>
                    </div>
         
     </c:forEach>
     
     
 </div>
 <!-- End Right Column -->


<!-- End Wrapper -->

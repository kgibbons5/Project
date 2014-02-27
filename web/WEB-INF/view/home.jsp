<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<%--<sql:query var="categories" dataSource="jdbc/Project">
    SELECT * FROM Category
</sql:query>--%>


         <!-- Begin Navigation -->
 <div id="navigation">
     <div class="tabs" id="">
   <c:forEach var="category" items="${categories}">
        
        <c:choose>
            <c:when test="${category.id == pageContext.request.queryString}">
                
                    <span class="tabContent">
                        ${category.genre}
                    </span>
                
            </c:when>
            <c:otherwise>
                <font colour="white">
                <strong>
                    
                 <a data-toggle=" ${category.id}" href="category?${category.id}">${category.genre}</a>
                </strong>
                </font>
                
            </c:otherwise>
        </c:choose>

    </c:forEach>
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
     
     <c:forEach var="category" items="${categories}">
         
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

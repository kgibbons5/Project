<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%-- 
    Document   : category
    Created on : 24-Feb-2014, 17:25:14
    Author     : Katie
--%>

<sql:query var="categories" dataSource="jdbc/Project">
    SELECT * FROM Category
</sql:query>

<sql:query var="selectedCategory" dataSource="jdbc/Project">
    SELECT genre FROM Category WHERE id = ?
    <sql:param value="${pageContext.request.queryString}"/>
</sql:query>
    
<sql:query var="categoryProducts" dataSource="jdbc/Project">
    SELECT * FROM Product WHERE category_id = ?
    <sql:param value="${pageContext.request.queryString}"/>
</sql:query>

<!-- Begin Wrapper -->
<div id="wrapper">
 
    
 <!-- Begin Navigation -->
 <div id="navigation"> 
     <div class="tabs">
    <c:forEach var="category" items="${categories.rows}">

        <c:choose>
            <c:when test="${category.id == pageContext.request.queryString}">
                
                
                    <span class="tabContent">
                        ${category.genre}
                    </span>
                
            </c:when>
            <c:otherwise>
                 
                      <font color="white">
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
 <div id="browsecolumn"> 
     <center><strong><h2 id="catTitle">${selectedCategory.rows[0].genre}</h2></strong></center><br>
     
     <table id="productTable">
                     <c:forEach var="product" items="${categoryProducts.rows}" varStatus="iter">

        <tr>
            <td>
                <img src="${initParam.productImagePath}${product.pName}.jpg"
                    alt="img" height="100px" width="70px">
            </td>
            
            <td colspan="2">
                
                <strong>${product.pName}</strong><br>
                ${product.description}<br><br><br>
                
            </td>
            <td>
                <center>
              &euro; ${product.pPrice}
                </center>
            </td>
            
            <td>
                <center>
                <form action="addToCart" method="post">
                    <input type="hidden"
                           name="productId"
                           value="${product.pID}">
                    <input type="submit"
                           value="add to cart">
                </form>
                    <center>
            </td>
        </tr>

    </c:forEach>
                </table>
     
  
 </div>
</div>

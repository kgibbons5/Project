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
     <div class="tabs" id="selectedTab">
    <c:forEach var="category" items="${categories.rows}">
        
        <c:choose>
            <c:when test="${category.id == pageContext.request.queryString}">
                
                 <a data-toggle=" ${category.id}" href="category?${category.id}">${category.genre}</a>
                
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
<div id="leftcolumn"> 
 <div id="cat">
     <div id="cat_header">
       
       <h2>Menu</h2>
     </div>
    <ul>
       <li><a href="http://localhost:8080/Project/home">Home</a></li>
       <li><a href="http://localhost:8080/Project/about.jsp">About</a></li>
       
       <li><a href="http://localhost:8080/Project/contact.jsp">Contact</a></li>
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
<!--                <form action="addToCart" method="post">
                    <input type="hidden"
                           name="productId"
                           value="${product.pID}">
                    <input type="submit"
                           value="Add to Cart">
                </form>-->


<!--netbeans cart code below our previous cart code is above may need to change or 
modify one if theres a problem-->
                <form action="<c:url value='addToCart'/>" method="post">
                        <input type="hidden"
                               name="productId"
                               value="${product.pId}">
                        <input type="submit"
                               name="submit"
                               value="Add To Cart">
                    </form>
                    </center>
            </td>
        </tr>

    </c:forEach>
                </table>
     
  
 </div>
</div>

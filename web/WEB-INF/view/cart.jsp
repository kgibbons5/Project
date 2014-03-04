<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="view" value="/cart" scope="session"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cart Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="css//homePage.css" />
</head>
<body>
<!-- Begin Wrapper -->
<div id="wrapper">
 <!-- Begin Header -->
 <!-- End Header -->
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
 <div id="cat">
     <div id="cat_header">
       
       <h2>Categories</h2>
     </div>
    <ul>
       <li><a href="http://localhost:8080/Project/home">Home</a></li>
       <li><a href="http://localhost:8080/Project/about.jsp">About</a></li>
       
       <li><a href="http://localhost:8080/Project/contact.jsp">Contact</a></li>
     </ul>
     <div class="clearthis">&nbsp;</div>
   </div>
 
 </div>
 <div id="browsecolumn">
     <div id="singleColumn">

    <c:choose>
        <c:when test="${cart.numberOfItems > 1}">
            <p><fmt:message key="yourCartContains"/> ${cart.numberOfItems} <fmt:message key="items"/>.</p>
        </c:when>
        <c:when test="${cart.numberOfItems == 1}">
            <p><fmt:message key="yourCartContains"/> ${cart.numberOfItems} <fmt:message key="item"/>.</p>
        </c:when>
        <c:otherwise>
            <p><fmt:message key="yourCartEmpty"/></p>
        </c:otherwise>
    </c:choose>
            <div id="actionBar">
        <%-- clear cart widget --%>
        <c:if test="${!empty cart && cart.numberOfItems != 0}">

            <c:url var="url" value="viewCart">
                <c:param name="clear" value="true"/>
            </c:url>

            <a href="${url}" class="bubble hMargin"><fmt:message key="clearCart"/></a>
        </c:if>
            <c:set var="value">
            <c:choose>
                <%-- if 'selectedCategory' session object exists, send user to previously viewed category --%>
                <c:when test="${!empty selectedCategory}">
                    category
                </c:when>
                <%-- otherwise send user to welcome page --%>
                <c:otherwise>
                    home
                </c:otherwise>
            </c:choose>
        </c:set>
                    
        <c:url var="url" value="${value}"/>
        <a href="${url}" class="bubble hMargin"><fmt:message key="continueShopping"/></a>

        <%-- checkout widget --%>
        <c:if test="${!empty cart && cart.numberOfItems != 0}">
            <a href="<c:url value='checkout'/>" class="bubble hMargin"><fmt:message key="proceedCheckout"/></a>
        </c:if>
            </div>
            <c:if test="${!empty cart && cart.numberOfItems != 0}">
            <h4 id="subtotal"><fmt:message key="subtotal"/>:
          <fmt:formatNumber type="currency" currencySymbol="&euro; " value="${cart.subtotal}"/>
      </h4>
      
      <table id="cartTable">

        <tr class="header">
            <th><fmt:message key="product"/></th>
            <th><fmt:message key="name"/></th>
            <th><fmt:message key="price"/></th>
            <th><fmt:message key="quantity"/></th>
        </tr>
        <c:forEach var="cartItem" items="${cart.items}" varStatus="iter">

          <c:set var="product" value="${cartItem.product}"/>

          <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
            <td>
                <img src="${initParam.productImagePath}${product.name}.jpg"
                     alt="what the fuck happened"height="100px" width="70px">
            </td>

            <td>${product.name}</td>

            <td>
                <fmt:formatNumber type="currency" currencySymbol="&euro; " value="${cartItem.total}"/>
                <br>
                <span class="smallText">(
                    <fmt:formatNumber type="currency" currencySymbol="&euro; " value="${product.price}"/>
                    / <fmt:message key="unit"/> )</span>
            </td>
          
        
        <td>
                <form action="<c:url value='updateCart'/>" method="post">
                    <input type="hidden"
                           name="productId"
                           value="${product.id}">
                    <input type="text"
                           maxlength="2"
                           size="2"
                           value="${cartItem.quantity}"
                           name="quantity"
                           style="margin:5px">
                    <input type="submit"
                           name="submit"
                           value="Update">
                </form>
            </td>
          </tr>
        
        
        </c:forEach>
        
        
        
        
        
        
        
        
        
        
      </table>
        </c:if>
     </div>
        
     
 <!-- End Left Column -->
 <!-- Begin Left Middle Column -->
 


<%-- HTML markup starts below --%>


 <!-- End Footer -->
</div>
</div>
<!-- End Wrapper -->
</body>
</html>
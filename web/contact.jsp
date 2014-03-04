<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<sql:query var="categories" dataSource="jdbc/Project">
    SELECT * FROM Category
</sql:query>
<head>
<title>Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="css//homePage.css" />
</head>
<body>
<!-- Begin Wrapper -->
<div id="wrapper">
 <!-- Begin Header -->
 
 <div id="header">
 <a href=#>
            <img src="http://s25.postimg.org/fdz8rlb9b/dvdeals.gif" type="submit" id="logo" alt="logo" height="100%" width="20%">
            </a>
         
     <a href="index.jsp"><input type="submit" id="logout" value="Logout"/></a>
     
         </div>
 <!-- End Header -->
 <!-- Begin Navigation -->
 



         <!-- Begin Navigation -->
 <div id="navigation">
     <div class="tabs" id="">
   <c:forEach var="category" items="${categories.rows}">
        
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
       <input type="text" class="tftextinput" name="searchInput" size="21" maxlength="120">
       <input type="submit" value="search" class="tfbutton">
</form>
 </div>
    
 </div>
 <!-- End Navigation -->
 <!-- Begin Left Column -->
 <div id="leftcolumn"> 
 <div id="cat">
     <div id="cat_header">
       
       <h2>Menu</h2>
     </div>
      <ul>
       <li><a href="http://localhost:8080/Project/home">Home</a></li>
       <li><a href="http://localhost:8080/Project/about.jsp">About</a></li>
       
       <li class="last"><a href="http://localhost:8080/Project/contact.jsp">Contact</a></li>
     </ul>
     <div class="clearthis">&nbsp;</div>
   </div>
 
 </div>
 <!-- End Left Column -->
 <!-- Begin Left Middle Column -->
<div id="browsecolumn"> 
     
     <center><h1>Contact Us</h1>
     <h3>Póraich Troy: p.troy2@nuigalway.ie</h3><br>
     <h3>Brian Neary: b.neary2@nuigalway.ie</h3><br>
     <h3>Katie Gibbons: k.gibbons5@nuigalway.ie</h3><br>
     </center>
 </div>
 
 
 <!-- End Right Column -->
 <!-- Begin Footer -->
 <div id="footer"> 
    <center><h3><stong>
        @2014 DVDeals by Póraich Troy, Brian Neary and Katie Gibbons
   </strong></h3></center>
</div>

<!-- End Wrapper -->
</body>
</html>
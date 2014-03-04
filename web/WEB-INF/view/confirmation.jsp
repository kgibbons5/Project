<%-- 
    Document   : confirmation
    Created on : 18-Feb-2014, 13:40:24
    Author     : Katie
--%>

<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>--%>


    
<%--<sql:query var="orderRecord" dataSource="jdbc/Project">
    SELECT * FROM customer_order
    <sql:param value="${pageContext.request.queryString}"/>
</sql:query>--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div id="leftcolumn">
    </div>
    
  <div id="browsecolumn">
    <div id="singleColumn">
        <center><strong><h4> Thank you for your order! </h4></strong></center><br>
    
       
        <br><br>
        <center><strong><h4> Please keep a copy of the confirmation number below: </h4></strong></center><br>
        <center><strong>${orderRecord.confirmationNumber}</strong></center>
        <br>
        <br><center><img src="http://www.clker.com/cliparts/G/F/D/c/j/r/correct-md.png" alt="tick" height="50%" width="25%"></center>

</div>
  </div>

</html>

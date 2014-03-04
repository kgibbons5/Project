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

    <p id="confirmationText">
        <strong><fmt:message key="successMessage"/></strong>
        <br><br>
        <fmt:message key="confirmationNumberMessage"/>
        <strong>${orderRecord.confirmationNumber}</strong>
        <br>
        <fmt:message key="contactMessage"/>
        <br><br>
        <fmt:message key="thankYouMessage"/>
    </p>
    
    
    
    
    

 

    <div class="summaryColumn" >

        
    </div>
</div>
  </div>

</html>

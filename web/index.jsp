<%-- 
    Document   : home
    Created on : 08-Jan-2014, 16:22:05
    Author     : Katie


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Login Details</h1>
    <form id="loginform" action="login.jsp" method="post">
    <table>
        <tr><td>ID:</td><td><input type="text" id = "id" name="id" /></td></tr>
        <tr><td>Password</td><td><input type="text" id = "password" name="password" /></td></tr>
            
    </table>
    <input type="submit" id="submit" value="Login" /> <%-- Login?--%>
    </form>
<a href="register.jsp"><strong>Register here!</strong></a> <%--Link to register--%> 
</body>
</html>
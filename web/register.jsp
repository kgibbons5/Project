<%-- 
    Document   : register
    Created on : 16-Jan-2014, 14:41:23
    Author     : Katie
--%>


<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>

    <h1>Registration details</h1>
    <form id="Register" action="Register" method="post">
    <table>
        <tr><td>ID:</td><td><input type="text" id = "id" name="id" /></td></tr>
        <tr><td>FirstName</td><td><input type="text" id = "firstName" name="firstName" /></td></tr>
        <tr><td>SurName</td><td><input type="text" id = "surName" name="surName" /></td></tr>
        <tr><td>Email</td><td><input type="text" id = "email" name="email" /></td></tr>
        <tr><td>Password</td><td><input type="text" id = "password" name="password" /></td></tr>
        
    </table>
    <input type="submit" id="Register" value="Register" />
    </form>
</body>
</html>

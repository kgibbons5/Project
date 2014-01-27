<!DOCTYPE html>
<html>
    
    <head>
        <title>Register/Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body bgcolor="#B4CFEC">
        
        <div class="main">
         <center> 
             <font size ="7" color="#9F000F" face="IMPACT">
             <p>Welcome to
             <img src="http://s25.postimg.org/5rbtbyz3z/dvdealslogo.png" alt="Logo Image" height="30%" width="20%"></p>
             <font size = "4" color="#151B54" face="times new roman">  
             <h1>Login Below </h1>
    
             <form id="loginform" action="Login" method="post">
                 <table cellspacing="10">
                    <tr><td>ID:</td><td><input type="text" id = "id" name="id" /></td></tr>
                    <tr><td>Password</td><td><input type="Password" id = "password" name="password" /></td></tr>
                 </table>
               <input type="submit" id="submit" value="Login"/> <%-- Login?--%>
             </form>
             
               <a href="register.jsp"><strong><h2>Register here!</h2></strong></a> <%--Link to register--%> </body>
          </center>   
          </div>
     </body>
     
</html>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
            <img src="http://s25.postimg.org/fdz8rlb9b/dvdeals.gif" id="logo" alt="logo" height="100%" width="20%">
            </a>
         
     <a href="index.jsp"><input type="submit" id="logout" value="Logout"/></a>
     
         <div id =  "cart">
          <a href="cart.jsp">
            <img src="http://www.buffalochamber.org/images/shopping_cart.png" id="cart" alt="cart" height="15%" width="15%">
            </a>
             </div>
         </div>
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
 
<form id="tfnewsearch" action="Search" method="post">
       <input type="text" class="tftextinput" name="searchInput" size="21" maxlength="120">
           <input type="submit" value="search" class="tfbutton">
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
       <li class="last"><a href="categories\romance.jsp">Romance</a></li>
     </ul>
     <div class="clearthis">&nbsp;</div>
   </div>
 
 </div>
 <!-- End Left Column -->
 <!-- Begin Left Middle Column -->
 <div id="browsecolumn"> 
<center><strong><h2>Comedy Films...</h2></strong></center>
<table id="productTable">
                    <tr>
                        <td class="lightBlue">
                            <img src="Images/Love Actually.jpg" alt="image" height="100px" width="70px">
                        </td>
                        <td class="lightBlue">
                            <strong>Love Actually</strong>
                            <br>
   
                        </td>
                        <td class="lightBlue"><pre>      price</pre></td>
                        <td class="lightBlue">
                            <form action="#" method="post">
                                <input type="submit" value="View Product">
                            </form>
                        </td>
                    </tr>
                    
                    <tr>
                        <td class="white">
                            <img src="Images/Dear John.jpg" alt="image" height="100px" width="70px">
                        </td>
                        <td class="white">
                            <strong>Dear John</strong>
                            <br>
                        
                        </td>
                        <td class="white"><pre>      price</pre></td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="View Product">
                            </form>
                        </td>
                    </tr>
                    
                    <tr>
                        <td class="white">
                            <img src="Images/Dirty Dancing.jpg" alt="image" height="100px" width="70px">
                        </td>
                        <td class="white">
                            <strong>Dirty Dancing</strong>
                            <br>
                      
                        </td>
                        <td class="white"><pre>      price</pre></td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="View Productn">
                            </form>
                        </td>
                    </tr>
    
                     <tr>
                        <td class="white">
                            <img src="Images/The Notebook.jpg" alt="image" height="100px" width="70px"/>
                        </td>
                        <td class="white">
                            <strong>The Notebook</strong>
                            <br>
                    
                        </td>
                        <td class="white"><pre>      price</pre></td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="View Product">
                            </form>
                        </td>
                    </tr>
                </table>
 </div>
 
<div id="footer"> This is the Footer </div>
 <!-- End Footer -->
</div>

<!-- End Wrapper -->
</body>
</html>
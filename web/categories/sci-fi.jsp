<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="categories.css" />
</head>
<body>
<!-- Begin Wrapper -->
<div id="wrapper">
 <!-- Begin Header -->
 
 <div id="header">
 <a href="#">
            <img src="http://s25.postimg.org/fdz8rlb9b/dvdeals.gif" id="logo" alt="logo" height="100%" width="20%">
            </a>
         
     <a href="index.jsp"><input type="submit" id="logout" value="Logout"/></a>
     
         <div id =  "cart">
          <a href="#">
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
 
 <form id="tfnewsearch" method="get" action="http://www.google.com">
       <input type="text" class="tftextinput" name="q" size="21" maxlength="120"><input type="submit" value="search" class="tfbutton">
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
Sci-Fi Films...<table id="productTable">
                    <tr>
                        <td class="lightBlue">
                            <img src="Products/Inception.jpg" alt="image" height="100px" width="70px"/>
                        </td>
                        <td class="lightBlue">
                        <strong>Inception</strong>
                            <br>
                            <span class="smallText"><p>A skilled extractor is offered a chance to regain 
                                    his old life as payment for a task considered to be impossible.</p></span>
                        </td>
                        <td class="lightBlue">[ price ]</td>
                        <td class="lightBlue">
                            <form action="#" method="post">
                                <input type="submit" value="purchase button">
                            </form>
                        </td>
                    </tr>
                        
                    <tr>
                        <td class="white">
                            <img src="Products/E.T.jpg" alt="image" height="100px" width="70px">
                        </td>
                        
                        <td class="white">
                            <strong>E.T</strong>
                            <br>
                            <span class="smallText"><p>A troubled child summons the courage to help a 
                            friendly alien escape Earth and return to his home-world</p></span>
                        </td>
                        <td class="white">[ price ]</td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="purchase button">
                            </form>
                        </td>
                    </tr>
    
                     <td class="white">
                            <img src="Products/Super 8.jpg" alt="image" height=100px" width="70px">
                        </td>
                        <td class="white">
                            <strong>Super 8</strong>
                            <br>
                            <span class="smallText"><p>During the summer of 1979, a group of friends witness a train
                             crash and investigate subsequent unexplained events in their small town.</p></span>
                        </td>
                        <td class="white">[ price ]</td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="purchase button">
                            </form>
                        </td>
                    </tr>
                    
                    <tr>
                        <td class="white">
                            <img src="Products/The Matrix.jpg" alt="image" height=100px" width="50px">
                        </td>
                        <td class="white">
                            <strong>The Matrix</strong>
                            <br>
                            <span class="smallText"><p>A computer hacker learns from mysterious rebels
                                    about the true nature of his reality and his role in the war against
                                    its controllers.</p></span>
                        </td>
                        <td class="white">[ price ]</td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="purchase button">
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
<%-- 
    Document   : index
    Created on : May 6, 2014, 8:32:44 PM
    Author     : Asad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <img src="http://24.media.tumblr.com/d0e8576f91a4fdf6b072f5de4add8504/tumblr_mh0x405Cky1s3sqv4o1_1280.jpg" alt="some_text" width="400" height="200">

        <form action="ControllerServlet" method="post">  
            
Customer Name:<input type="text" name="name" align="left"><br>  
Customer Passport Number:<input type="text" name="passport" align="left"><br>
Customer ID:<input type="text" name="customerid" align="left"><br>
Customer Phone:<input type="text" name="phone" align="left"><br>
Customer Address:<input type="text" name="address" align="left"><br>

Flight Number:<input type="text" name="flightnumber" align="left"><br>
Departure Date (DD/MM/YYYY):<input type="text" name="depdate" align="left"><br>
<br>

<input type="submit" value="Submit">  
</form>  
    </body>
</html>

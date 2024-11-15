<%-- 
    Document   : SearchBooking
    Created on : May 11, 2014, 1:56:59 PM
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
        <h1>Hello World!</h1>
        <form action="SearchBookingServlet" method="post">  
        Enter Booking Number:<input type="text" name="bookingNumber" align="left"><br>  
        <input type="submit" value="Search">  
        </form>
    </body>
</html>

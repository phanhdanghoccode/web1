<%-- 
    Document   : index
    Created on : 06-May-2014, 21:26:22
    Author     : Umair Khan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC travel Agency</title>
    </head>
    <body>
        <h1>Hotel Booking Department</h1>
        <form name="detail" action="MVCServlet">
          Flight Booking Number:  <input type="text" name="flightBookingNo" value="" />
            <input type="submit" value="Submit" name="submit" />
            <input type="hidden" name="namePage" value="index.jsp" />
        </form>
        
        
    </body>
</html>

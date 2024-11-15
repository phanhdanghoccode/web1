<%-- 
    Document   : HotelBookPage
    Created on : 06-May-2014, 22:24:41
    Author     : Umair Khan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checking Availability</title>
    </head>
    <body>
        <h1>Hotel Booking Page</h1>
        <p>Checking room for Booking No: ${flightBookingNumber} </p>
        <form name="HotelBookingForm" action="MVCServlet">
          Room Category:  <input  Room Category type="text" name="roomType" value="" />
          
            <input type="submit" value="Search" name="roomTypeButton" />
              <input type="hidden" name="namePage" value="HotelBookPage.jsp" />
        </form>
        
    </body>
</html>

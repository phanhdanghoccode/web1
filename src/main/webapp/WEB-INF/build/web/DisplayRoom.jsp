<%-- 
    Document   : DisplayRoom
    Created on : 08-May-2014, 23:46:11
    Author     : Umair Khan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="room" scope="session" type="business.Room" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Room</title>
    </head>
    <body>
        <p>Checking room for Flight Booking No: ${flightBookingNumber} </p>
        <h1>Available Room:</h1>
        <p> Category:<jsp:getProperty name="room" property="type" /></p>
        <p> Rent in PKR /Night:<jsp:getProperty name="room" property="rent" /></p>
        <p> Room Number:<jsp:getProperty name="room" property="roomNo" /></p>
        <p> Please press the 'Make Booking' button to confirm button against respective Flight Booking No </p>
        <form name="confirmBookingForm" action="ConfirmBookingServlet">
            <input type="submit" value="Make Booking" name="confirmBookingButton" /><input type="hidden" name="flightBookingNo" value=${flightBookingNumber} />
            
            
        </form>
            
            
        
        
        
    </body>
</html>

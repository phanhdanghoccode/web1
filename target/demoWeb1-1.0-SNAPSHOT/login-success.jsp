
<%@page import="jakarta.enterprise.inject.spi.Bean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import=" java.Bean.LoginBean"%>  
<%@page import=" java.Bean.FlightBean"%>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            
            
            out.println((String)request.getAttribute("status"));
            %>
        
<p>You have successfully booked a seat! </p>  
<br>

<%
FlightBean flightBean = (FlightBean)request.getAttribute("bean");
%>
<%
out.println("Thank you Mr/Mrs."+flightBean.getSeatList().get(0).getObj().getCustomerName());
%>
<br>
<%
out.println("Your BookingNumber is :"+flightBean.getSeatList().get(0).getBookingNumber());


%>
<br>
<%
//FlightBean flightBean = (FlightBean)request.getAttribute("bean");
out.println("Your flightNumber is : "+flightBean.getFlightNumber()  );
%>
<br>
<%
out.println("Your departureDate is : "+flightBean.getDepartureDate());

//List <SeatBean> seatList = flightBean.getSeatList();
%>
<br>


    </body>
</html>

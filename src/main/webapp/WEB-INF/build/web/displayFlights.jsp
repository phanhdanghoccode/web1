<%-- 
    Document   : displayFlights
    Created on : May 11, 2014, 12:21:01 AM
    Author     : Asad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Bean.FlightBean"%> 
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="2" style="width:500px">
<tr>
  <th>Flight Number</th>
  <th>Destination</th> 
  <th>Departure Date</th>
  <th>Departure Time</th>
  <th>No. of Seats</th>
</tr>
<tr>
    <% List <FlightBean> showList = (List<FlightBean>)request.getAttribute("info");
    for (int i = 0 ; i <showList.size() ; i++)
            {
                %>
                <td><% out.println(showList.get(i).getFlightNumber());%></td>
                <td><% out.println(showList.get(i).getDestination());%></td>
                <td><% out.println(showList.get(i).getDepartureDate());%></td>
                <td><% out.println(showList.get(i).getDepartureTime());%></td>
                <td><% out.println(showList.get(i).getNoOfSeats());%> </td><br>
                <%
            }
    %>
  
</tr>
</table>
    </body>
</html>

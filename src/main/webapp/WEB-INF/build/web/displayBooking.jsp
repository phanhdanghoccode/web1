<%-- 
    Document   : displayBooking
    Created on : May 11, 2014, 8:41:10 PM
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
            <%
                List <String> showList = (List<String>)request.getAttribute("info");
            %>
        <table border="2" style="width:500px">
    <tr>
        <th>Customer ID</th>
        <th>Customer Name</th> 
        <th>Flight Number</th>
        <th>Destination</th>
        <th>Departure Date</th>
        <th>Departure Time</th>
    </tr>
    <tr>
        <td><%out.println(showList.get(0));%></td>
        <td><%out.println(showList.get(1));%></td> 
        <td><%out.println(showList.get(2));%></td>
        <td><%out.println(showList.get(3));%></td>
        <td><%out.println(showList.get(4));%></td>
        <td><%out.println(showList.get(5));%></td>
</tr>
</table>
        
    </body>
</html>

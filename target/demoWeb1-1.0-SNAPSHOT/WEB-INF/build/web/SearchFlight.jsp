<%-- 
    Document   : SearchFlight
    Created on : May 10, 2014, 11:50:19 PM
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
        <form action="SearchServlet" method="post">  
        Destination:<input type="text" name="destination" align="left"><br>  
        Departure Date:<input type="text" name="depdate" align="left"><br>
        <input type="submit" value="Search">  
        </form>
    </body>
</html>

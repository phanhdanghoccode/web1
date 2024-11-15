
package java.DBLayer;


import java.Bean.FlightBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBHandler 
{
    public static FlightBean getDestination(FlightBean obj, String flightNumber)
    {
        try
        {
        Connection conn = DBConnection.Connect();
        String sql = "SELECT * FROM APP.FLIGHT WHERE FLIGHTNUMBER = '"+flightNumber+"'";
        
        
        PreparedStatement prepSt = conn.prepareStatement(sql);
        java.sql.Statement stmt= conn.createStatement();
        
        //prepSt.setInt(1, id);
        
        
        ResultSet rs = stmt.executeQuery(sql);
        
        //String information="NULL";
        
        
        while(rs.next())
        {
            
            
            String dest = rs.getString("DESTINATION");
            
            String depTime = rs.getString("DEPARTURETIME");
            
            
        obj.setDestination(dest);
        obj.setDepartureTime(depTime);
        }
        
        return obj;

        }

        catch (Exception E)
        {
            E.printStackTrace();
            return null;
            //return false;
        }


    }
    
    public static String addBookingToDatabase (FlightBean obj, int bookNumber)
    {
        try
        {
            


        Connection conn = DBConnection.Connect();
        String sql = "INSERT INTO APP.BOOKING VALUES (?,?,?,?,?,?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);

        for (int i = 0 ; i<obj.getSeatList().size() ; i++)
        {
            
            if (obj.getSeatList().get(i).getBookingNumber()== bookNumber)
            {
                prepSt.setInt(1, obj.getSeatList().get(i).getBookingNumber());
                prepSt.setString(2, obj.getSeatList().get(i).getObj().getCustomerID());
                prepSt.setString(3, obj.getSeatList().get(i).getObj().getCustomerName());
            }   
        }
                //prepSt.setString(4, obj.getSeatList().get(i).getObj().getCustomerPassportNumber());
            
        
        
        prepSt.setString(4, obj.getFlightNumber());
        prepSt.setString(5, obj.getDestination());
       
        prepSt.setString(6, obj.getDepartureDate());
        prepSt.setString(7, obj.getDepartureTime());
        
        
        
                
        
        
        
        

        int result = prepSt.executeUpdate();

        if (result>0)
        {
            return "true";

        }

        else
        {
            return "false";
        }


        }

        catch (Exception E)
        {
           String exc = E.getMessage();
            return exc;
        }
    }

    
    
    public static List<FlightBean> displayFlightFromDatabase (String destination, String departureDate)
    {
        try
        {


        Connection conn = DBConnection.Connect();
        String sql = "SELECT * FROM APP.FLIGHT WHERE DESTINATION = '"+destination+ "'AND DEPARTUREDATE = '"+departureDate+"'";
        
        
        PreparedStatement prepSt = conn.prepareStatement(sql);
        java.sql.Statement stmt= conn.createStatement();
        
        //prepSt.setInt(1, id);
        
        
        ResultSet rs = stmt.executeQuery(sql);
        
        //String information="NULL";
        List <FlightBean> flightList = new ArrayList <FlightBean>();
        FlightBean obj = new FlightBean();
        
        while(rs.next())
        {
            
            String flightNumber = rs.getString("FLIGHTNUMBER");
            String dest = rs.getString("DESTINATION");
            String depDate = rs.getString("DEPARTUREDATE");
            String depTime = rs.getString("DEPARTURETIME");
            int seats = rs.getInt("NUMBEROFSEATS");
            
            obj.setFlightNumber(flightNumber);
            obj.setDestination(dest);
            obj.setDepartureDate(depDate);
            obj.setDepartureTime(depTime);
            obj.setNoOfSeats(seats);
            
            flightList.add(obj);
            
            
        }

        return flightList;

        }

        catch (Exception E)
        {
            E.printStackTrace();
            return null;
            //return false;
        }


    }
    
    public static List<String> displayBookingFromDatabase (int bookingNumber)
    {
        try
        {


        Connection conn = DBConnection.Connect();
        String sql = "SELECT * FROM APP.BOOKING WHERE BOOKINGNUMBER = "+bookingNumber+"";
        
        
        PreparedStatement prepSt = conn.prepareStatement(sql);
        java.sql.Statement stmt= conn.createStatement();
        
        //prepSt.setInt(1, id);
        
        
        ResultSet rs = stmt.executeQuery(sql);
        
        //String information="NULL";
        List <String> bookingInfo = new ArrayList <String>();
        
        
        while(rs.next())
        {
            
            String customerID = rs.getString("CUSTOMERID");
            String customerName = rs.getString("CUSTOMERNAME");
            String flightNumner = rs.getString("FLIGHTNUMBER");
            String destination = rs.getString("DESTINATION");
            String departureDate = rs.getString("DEPARTUREDATE");
            String departureTime = rs.getString("DEPARTURETIME");
            
            
            
            bookingInfo.add(customerID);
            bookingInfo.add(customerName);
            bookingInfo.add(flightNumner);
            bookingInfo.add(destination);
            bookingInfo.add(departureDate);
            bookingInfo.add(departureTime);
            
            
            
        }

        return bookingInfo;

        }

        catch (Exception E)
        {
            E.printStackTrace();
            //return null;
            List <String> errorInfo = new ArrayList<String>();
            errorInfo.add(E.getMessage());
            return errorInfo;
        }


    }
    
    }
    
    

    


    


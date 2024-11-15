
package java.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbController {
    
    public void AddPaymentDB(String type,int rent,int roomNo)
    {
        try
        {//System.out.println("hello");
            Statement st;
        String host="jdbc:derby://localhost:1527/HotelDb";
        String uName=" ";
        String uPass=" ";
        Connection con=DriverManager.getConnection(host);//,uName,uPass);
        st=con.createStatement();
String sql = "insert into APP.ROOM_TABLE(ROOMNO,TYPE,RENT) values ("+roomNo+",'"+type+"',"+rent+")";
PreparedStatement prepSt = con.prepareStatement(sql);
//prepSt.setInt(1, id);
System.out.println("hello");

st.executeUpdate(sql);
        }

        catch(SQLException err)
        {
            System.out.println(err.getMessage());
        } 
    }
    
}

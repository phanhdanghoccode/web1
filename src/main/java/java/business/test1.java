
package java.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class test1 {
    public static void main(String args[])
    {
         try
        {//System.out.println("hello");
            int roomNo=123;
            int rent=12345;
            String typer="suite";
            Statement st;
        String host="jdbc:derby://localhost:1527/HotelDb";
        String uName=" ";
        String uPass=" ";
        Connection con=DriverManager.getConnection(host);//,uName,uPass);
        st=con.createStatement();
String sql = "insert into APP.ROOM_TABLE(ROOMNO,TYPE,RENT) values ("+roomNo+",'"+typer+"',"+rent+")";
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

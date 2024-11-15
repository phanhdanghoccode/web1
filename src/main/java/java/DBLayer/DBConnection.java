
package java.DBLayer;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection 
{
 
    public static Connection Connect()
    {
        try
        {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String connString  = "jdbc:derby://localhost:1527/MyDatabase";
        String username = "asad";
        String password = "asad";

        Connection conn= DriverManager.getConnection(connString, username, password);
        return conn;
    
        }
        catch(Exception E)
        {
            E.printStackTrace();
            return null;

        }

        


    }

}

    


    


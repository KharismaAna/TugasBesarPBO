
package tugbes.pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {

    private static Connection connect;
    public static Connection tryConnect() {
     
        if(connect == null)
        
        {
        try{
            String url  ="jdbc:mysql://localhost/tubespbo";
            String user ="root";
            String pass ="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connect = DriverManager.getConnection(url,user,pass);
        }catch (SQLException ex){
            System.out.println("Not Found");
        }
        
        }
        return connect;
    }
    
}

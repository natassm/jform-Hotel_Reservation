/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservation.Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Natasha
 */
public class Koneksi {
    
    public static Connection open()
    {
        Connection con;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:51688;instance=SQLSERVER;" 
                    + "databaseName=hotel_r4";
            
            con = DriverManager.getConnection(url, "nat", "767676");
            System.out.println(con);
            return con;
        }
        catch (Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
}

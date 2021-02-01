package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection connect;
    
    public static Connection koneksi() {
        connect = null;
        try {
            //Memanggil Driver JDBC
            Class.forName("org.mariadb.jdbc.Driver");
            
            //Membangun koneksi dengan database servernya
            String url = "jdbc:mariadb://localhost:3306/smart_rtrw_app";
            String user = "admin"; //Nama User
            String pwd = "admin123"; //Password
            connect = DriverManager.getConnection(url, user, pwd);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return connect;
    }
    
}

package dainam.edu.vn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyConnect {
  
    Connection conn;
    

		String url = "jdbc:mysql://localhost:3306/SINHVIEN2?setUnicode=true&characterEncoding=UTF-8";
		String user = "root";
		String pass = "";
	
    public MyConnect(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
          
            conn = DriverManager.getConnection(url, user, pass);
            
            if(conn != null){
                System.out.println("Kết nối thành công!");
            }
            else{
                System.out.println("Kết nối thất bại");
            }
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }   
    }
    
    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){
       
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}

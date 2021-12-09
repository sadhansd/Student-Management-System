import java.sql.*;
import javax.swing.JOptionPane;
public class database {
    final static String driver = "com.mysql.cj.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL";
    final static String user = "root";
    final static String pass = "sadhu3sr";

    public static Connection connection(){
        
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}

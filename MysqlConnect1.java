package CAFE;
import java.sql.*;
import javax.swing.*;


public class MysqlConnect1 {
    Connection con=null;
    public static Connection ConnectDB()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria","root","");
            //JOptionPane.showMessageDialog(null,"Connected to Databse");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
}
}
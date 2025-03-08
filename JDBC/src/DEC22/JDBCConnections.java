package DEC22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCConnections {
    public static void main(String[] args) {
        try{
            //step-1 load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step2- creating the connection
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");

            //creating the statements
            String sql = "insert into emp_info(name,salary)values(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,"Prathamesh");
            ps.setInt(2,50000);

            //step-4 execute query
            ps.executeUpdate();

            //step-5 close the connection
            con.close();
            System.out.println("Data has bee successfully inserted");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

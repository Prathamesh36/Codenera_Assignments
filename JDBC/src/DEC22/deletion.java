package DEC22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletion {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your employee id: ");
            int s =sc.nextInt();
            String queryString ="delete from emp_info where id="+s;
            PreparedStatement ps =con.prepareStatement(queryString);
            int status =0;
            status=ps.executeUpdate();
            if(status>0) {
                System.out.println("Data Deleted Successfully...");
            }
            else {
                System.out.println("Something went wrong...");
            }
        } catch (Exception e) {

            System.out.println(e);
        }

    }

}

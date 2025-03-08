package DEC22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
            System.out.println("enter Employee id: ");
            int id = sc.nextInt();
            System.out.println("Update employee name: ");
            String name = sc1.nextLine();
            String query="update emp_info set name=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(2, id);
            ps.setString(1, name);
            int status =0;
            status = ps.executeUpdate();
            if(status>0) {
                System.out.println("Data updated...");

            }
            else {
                System.out.println("Something went wrong...");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

}

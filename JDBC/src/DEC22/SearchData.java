package DEC22;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
            System.out.println("Enter employee id: ");
            int id = sc.nextInt();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp_info where id="+id);
            System.out.println("--------Employee Information--------");
            while(rs.next()) {
                System.out.println("id\tname\tsalary");

                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

package Test16;

import java.sql.*;
import java.util.Scanner;

public class InsertDataUsingJDBCInEmployeeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept?useSSL=false&allowPublicKeyRetrieval=true","root","root");

            String sql = "insert into employee2(name,email,position,salary,doj,city,country,zip_code)values(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Employee name: ");
            String name=sc.next();
            System.out.print("Enter Employee Email: ");
            String email=sc.next();
            System.out.print("Enter Employee Position: ");
            String position=sc.next();
            System.out.print("Enter Employee Salary: ");
            int salary = sc.nextInt();
            System.out.print("Enter Employee DOJ: ");
            String doj=sc.next();
            System.out.print("Enter Employee City: ");
            String city=sc.next();
            System.out.print("Enter Employee Country: ");
            String country=sc.next();
            System.out.print("Enter Employee Zip_code: ");
            int zip_code = sc.nextInt();

            ps.setString(1, name);
            ps.setString(2,email);
            ps.setString(3, position);
            ps.setInt(4, salary);
            ps.setString(5, doj);
            ps.setString(6, city);
            ps.setString(7, country);
            ps.setInt(8, zip_code);

            ps.executeUpdate();
            con.close();
            System.out.println("Data has bee successfully inserted");

           Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from employee2");
            System.out.println("-----------Employee Information--------");
            System.out.println("Id\tName\t\tEmail\t\tPosition\tSalary\tdoj\tcity\tcountry\tzip_code");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getInt(9));
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}

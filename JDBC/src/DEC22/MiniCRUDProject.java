package DEC22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Scanner;


public class MiniCRUDProject extends Thread{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your ID:");
        int id = sc.nextInt();
        System.out.print("Enter Your Password: ");
        int pass = sc.nextInt();
        if(id==1234 && pass==7890) {
            int choice=10;
            while(choice!=6) {

                System.out.println("************************************");
                System.out.println("1.Add Employee Information" );
                System.out.println("2.View the list of Employee");
                System.out.println("3.Edit the Employee Information");
                System.out.println("4.Search Employee By Id");
                System.out.println("5.Delete the Employee Information");
                System.out.println("6.To Exit");
                System.out.println("***********************************");
                System.out.println("Enter Your choice: ");
                choice= sc.nextInt();

                switch (choice) {
                    case 1: {
                        try {
                            System.out.print("Loading");
                            for(int i=0;i<10;i++) {
                                System.out.print("*");
                                Thread.sleep(50);
                            }
                            System.out.println();
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");

                            String sql = "insert into employee(id,name,email,salary,designation,address)values(?,?,?,?,?,?)";

                            PreparedStatement ps = con.prepareStatement(sql);

                            System.out.print("Enter Employee Id: ");
                            int Eid = sc.nextInt();
                            System.out.print("Enter Employee name: ");
                            String name=sc.next();
                            System.out.print("Enter Employee Email: ");
                            String email=sc.next();
                            System.out.print("Enter Employee Salary: ");
                            int salary = sc.nextInt();
                            System.out.print("Enter Employee Designation: ");
                            String Desi=sc.next();
                            System.out.print("Enter Employee Address: ");
                            String Add=sc.next();

                            ps.setInt(1, Eid);
                            ps.setString(2, name);
                            ps.setString(3,email);
                            ps.setInt(4, salary);
                            ps.setString(5, Desi);
                            ps.setString(6, Add);

                            ps.executeUpdate();
                            con.close();
                            System.out.println("Data has bee successfully inserted");



                        } catch (Exception e) {

                            System.out.println(e);
                        }
                        break;
                    }
                    case 2:{
                        try {
                            System.out.print("Loading");
                            for(int i=0;i<10;i++) {
                                System.out.print("*");
                                Thread.sleep(50);
                            }
                            System.out.println();
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");

                            Statement st = con.createStatement();

                            ResultSet rs = st.executeQuery("select * from employee");
                            System.out.println("-----------Employee Information--------");
                            System.out.println("Id\tName\t\tEmail\t\tSalary\tDesignation\tAddress");
                            while(rs.next()) {
                                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t\t"+rs.getString(6));
                            }



                        } catch (Exception e) {

                            System.out.println(e);
                        }
                        break;
                    }
                    case 3:{
                        Scanner sc1= new Scanner(System.in);

                        try {
                            System.out.print("Loading");
                            for(int i=0;i<10;i++) {
                                System.out.print("*");
                                Thread.sleep(50);
                            }
                            System.out.println();
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
                            System.out.println("enter Employee id: ");
                            int Eide = sc.nextInt();
                            System.out.println("Update employee Designation: ");
                            String name = sc1.nextLine();
                            String query="Update employee set Designation=? where id=?";
                            PreparedStatement ps = con.prepareStatement(query);
                            ps.setInt(2, Eide);
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
                            System.out.println(e);
                        }
                        break;
                    }
                    case 4:{

                        try {
                            System.out.print("Loading");
                            for(int i=0;i<10;i++) {
                                System.out.print("*");
                                Thread.sleep(50);
                            }
                            System.out.println();
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
                            System.out.println("Enter employee id: ");
                            int Eid2 = sc.nextInt();
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("select * from employee where id="+Eid2);
                            System.out.println("--------Employee Information--------");
                            while(rs.next()) {
                                System.out.println("Id\tName\tEmail\t\t\tSalary\tDesignation\t\t\tAddress");

                                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
                            }


                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;
                    }
                    case 5:{
                        try {
                            System.out.print("Loading");
                            for(int i=0;i<10;i++) {
                                System.out.print("*");
                                Thread.sleep(50);
                            }
                            System.out.println();
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
                            System.out.println("Enter your employee id: ");
                            int s =sc.nextInt();
                            String queryString ="delete from employee where id="+s;
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
                        break;
                    }

                    default:
                        //throw new IllegalArgumentException("Unexpected value: " + choice);
                        System.out.println("Thank You!!!");
                }


            }
        }
        else {
            System.out.println("Invalid Id or Password");
        }


    }

}
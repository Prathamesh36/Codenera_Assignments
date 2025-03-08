package Test15;

import java.sql.*;
import java.util.Scanner;

public class StudentManagementSystem {
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
                System.out.println("1.Add Student Information" );
                System.out.println("2.View the list of Students");
                System.out.println("3.Edit the Student Information");
                System.out.println("4.Search Student By Id");
                System.out.println("5.Delete the Student Information");
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
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept?useSSL=false&allowPublicKeyRetrieval=true","root","root");

                            String sql = "insert into students(id,name,course,city,total_marks,phone_no)values(?,?,?,?,?,?)";

                            PreparedStatement ps = con.prepareStatement(sql);

                            System.out.print("Enter Student Id: ");
                            int Eid = sc.nextInt();
                            System.out.print("Enter Student name: ");
                            String name=sc.next();
                            System.out.print("Enter Student Email: ");
                            String course=sc.next();
                            System.out.print("Enter Student city: ");
                            String city=sc.next();
                            System.out.print("Enter Student Total Marks: ");
                            int marks = sc.nextInt();
                            System.out.print("Enter Student Phone N0: ");
                            int phone = sc.nextInt();

                            ps.setInt(1, Eid);
                            ps.setString(2, name);
                            ps.setString(3,course);
                            ps.setString(4, city);
                            ps.setInt(5, marks);
                            ps.setInt(6, phone);

                            ps.executeUpdate();
                            con.close();
                            System.out.println("Data has bee successfully inserted......");



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

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept?useSSL=false&allowPublicKeyRetrieval=true","root","root");

                            Statement st = con.createStatement();

                            ResultSet rs = st.executeQuery("select * from students");
                            System.out.println("-----------Students Information--------");
                            System.out.println("Id\tName\t\tCourse\t\tCity\tTotal_marks\tPhone_NO");
                            while(rs.next()) {
                                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t\t"+rs.getInt(6));
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

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept?useSSL=false&allowPublicKeyRetrieval=true","root","root");
                            System.out.println("Enter Student id: ");
                            int Eide = sc.nextInt();
                            System.out.println("Update Student City: ");
                            String name = sc1.nextLine();
                            String query="Update students set city=? where id=?";
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

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept?useSSL=false&allowPublicKeyRetrieval=true","root","root");
                            System.out.println("Enter student id: ");
                            int Eid2 = sc.nextInt();
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("select * from students where id="+Eid2);
                            System.out.println("--------Student Information--------");
                            while(rs.next()) {
                                System.out.println("Id\tName\t\tCourse\t\tCity\tTotal_marks\tPhone_NO");

                                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t\t"+rs.getInt(6));
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

                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept?useSSL=false&allowPublicKeyRetrieval=true","root","root");
                            System.out.println("Enter your student id: ");
                            int s =sc.nextInt();
                            String queryString ="delete from students where id="+s;
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

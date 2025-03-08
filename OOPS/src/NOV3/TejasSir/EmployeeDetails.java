package NOV3.TejasSir;

import java.util.Scanner;

class EmployeeDetail {
    private int ID;
    private String Name;
    private String Role;
    private int Salary;
    private String City;

    EmployeeDetail(int ID, String name, String role, int salary, String city) {
        setID(ID);
        setName(name);
        setRole(role);
        setSalary(salary);
        setCity(city);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}


public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1;
        System.out.print("Enter the number of Employees details you want to insert: ");
        int u=sc.nextInt();

        while (k <= u) {
            System.out.print("Enter your ID: ");
            int n = sc.nextInt();
            System.out.print("Enter Your Name: ");
            String name = sc.next();
            System.out.print("Enter Role: ");
            String role = sc.next();
            System.out.print("Enter Salary: ");
            int saly = sc.nextInt();
            System.out.print("Enter City: ");
            String city = sc.next();
            EmployeeDetail ac = new EmployeeDetail(n, name, role, saly,city);
            System.out.println("*********Employee Details***********");
            System.out.println("ID: " + ac.getID());
            System.out.println("Name: " + ac.getName());
            System.out.println("Role: " + ac.getRole());
            System.out.println("Salary: " + ac.getSalary());
            System.out.println("City: "+ac.getCity());
            System.out.println("***********************************");
            k++;
        }
    }
}

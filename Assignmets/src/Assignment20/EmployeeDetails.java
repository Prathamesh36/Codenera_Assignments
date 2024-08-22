/*Q4. Wap to take employee record and show the example of single level inheritance
(make class and method as your need)?*/
package Assignment20;
import java.util.Scanner;

class Employees{
    int id;
    String name;
    double salary;
    Employees(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void disp(){
        System.out.println("***** Employee Info ******");
        System.out.println("Employee ID is: "+id);
        System.out.println("Employee name is: "+name);
        System.out.println("Employee salary is: "+salary);
    }
}

public class EmployeeDetails extends Employees{
    EmployeeDetails(int id,String name,double salary){
        super(id,name,salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        EmployeeDetails ob = new EmployeeDetails(id,name,salary);
        ob.disp();
    }
}
/***********************OUTPUT**************************
 Enter ID: 54230
 Enter name: Prathamesh
 Enter salary: 50000
 *****Employee Info******
 Employee ID is: 54230
 Employee name is: Prathamesh
 Employee salary is: 50000.0
 *******************************************************/
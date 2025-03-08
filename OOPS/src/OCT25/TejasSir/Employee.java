/*Q4. Wap to take employee record and show the example of single level inheritance (make class and method as your need)?*/
package OCT25.TejasSir;
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
    public void ele() {
        double anu = salary * 12;
        System.out.print("Annual salary is: "+anu);
    }
}

public class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        Employees ob = new Employees(id,name,salary);
        ob.ele();
    }
}


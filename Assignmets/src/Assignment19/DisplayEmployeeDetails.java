package Assignment19;

import java.util.Scanner;

class Employee{
    int id;
    String name;
    int age;
    int salary;
    Employee(int id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void disp(){
        System.out.println("*********Employee Details********");
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary is: "+salary);

    }
}

public class DisplayEmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee name: ");
        String name = sc.next();
        System.out.print("Enter Employee age: ");
        int age = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        int salary= sc.nextInt();
        Employee ob = new Employee(id,name,age,salary);
        ob.disp();
    }
}
/*********************OUTPUT************************
 Enter Employee id: 52101
 Enter Employee name: Prathamesh
 Enter Employee age: 23
 Enter Employee Salary: 80000
 *********Employee Details********
 Employee ID: 52101
 Employee Name: Prathamesh
 Employee Age: 23
 Employee Salary is: 80000
 ****************************************************/
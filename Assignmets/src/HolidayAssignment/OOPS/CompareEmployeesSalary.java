package HolidayAssignment.OOPS;

import java.util.Scanner;

class Employees1{
    int age;
    String name;
    double salary;
    Employees1(int age,String name,double salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
    public void compare() {
        System.out.println("--Employee with The Highest Salary--");
        System.out.println("Employee name: "+name);
        System.out.println("Employee age: "+age);
        System.out.println("Employee Salary: "+salary);

    }
}

public class CompareEmployeesSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***Enter Two employees information***");
            System.out.print("Enter Employee 1 name: ");
            String name = sc.next();
            System.out.print("Enter Employee 1 Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Employee 1 salary: ");
            double salary = sc.nextDouble();
            Employees1 ob = new Employees1(age, name, salary);
            System.out.print("Enter Employee 2 name: ");
            String name1 = sc.next();
            System.out.print("Enter Employee 2 Age: ");
            int age1 = sc.nextInt();
            System.out.print("Enter Employee 2 salary: ");
            double salary1 = sc.nextDouble();
            Employees1 ob1 = new Employees1(age1, name1, salary1);
            if(ob.salary>ob1.salary){
                ob.compare();
            }
            else{
                ob1.compare();
            }
    }
}
/***********************OUTPUT************************
 ***Enter Two employees information***
 Enter Employee 1 name: Prathamesh
 Enter Employee 1 Age: 23
 Enter Employee 1 salary: 45000
 Enter Employee 2 name: Pawan
 Enter Employee 2 Age: 21
 Enter Employee 2 salary: 22000
 --Employee with The Highest Salary--
 Employee name: Prathamesh
 Employee age: 23
 Employee Salary: 45000.0
 ****************************************************/
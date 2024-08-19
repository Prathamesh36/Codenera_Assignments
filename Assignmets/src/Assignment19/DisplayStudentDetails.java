/*
Q3.Write a program to create two class . In this first class take input of student details and display in other class  take method by your self.*/
package Assignment19;

import java.util.Scanner;

class Student{
    int id;
    String name;
    int age;
    String div;
    Student(int id, String name, int age, String div){
        this.id = id;
        this.name = name;
        this.age = age;
        this.div = div;
    }
    public void disp(){
        System.out.println("*********Student Details********");
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Division: "+div);

    }
}

public class DisplayStudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student id: ");
        int id = sc.nextInt();
        System.out.print("Enter Student name: ");
        String name = sc.next();
        System.out.print("Enter Student age: ");
        int age = sc.nextInt();
        System.out.print("Enter Student division: ");
        String div= sc.next();
        Student ob = new Student(id,name,age,div);
        ob.disp();
    }
}
/*********************OUTPUT************************
 Enter Student id: 201
 Enter Student name: Satish
 Enter Student age: 12
 Enter Student division: B
 *********Student Details********
 Student ID: 201
 Student Name: Satish
 Student Age: 12
 Student Division: B
 ****************************************************/
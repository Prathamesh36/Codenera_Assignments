package Amdocs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {


    static int x=1;
    String name;
    Student(String name){
        this.name=name;
    }
    public String toString(){
        String temp =x+": "+name;
        x++;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfStudents=sc.nextInt();

        while(noOfStudents>0){
            String name = sc.next();
            Student student = new Student(name);
            System.out.println(student.toString());
            noOfStudents++;
        }
    }


}

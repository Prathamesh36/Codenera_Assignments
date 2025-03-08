package OCT25.TejasSir;

import java.util.Scanner;

class Student{
    int id;
    String name;
    int marks;
    Student(int id, String name,int marks){
        this.id = id;
        this.name=name;
        this.marks=marks;
    }
    public void grade(){
        if(marks>=90 && marks<=100){
            System.out.print("Grade is: A");
        }
        else if(marks<90 && marks >=80){
            System.out.print("Grade is: B");
        }
        else if(marks<80 && marks >=70){
            System.out.print("Grade is: C");
        }
        else if(marks<70 && marks >=60){
            System.out.print("Grade is: D");
        }
        else if(marks<60 && marks >=50){
            System.out.print("Grade is: E");
        }
        else{
            System.out.print("Grade is: F");
        }
    }

}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter total Marks: ");
        int marks= sc.nextInt();
        Student ob = new Student(id,name,marks);
        ob.grade();
    }
}

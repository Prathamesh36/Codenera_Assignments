/*6)constructor chaining concept.
student s1=new student();
student s3=new student(80,90)
student s4-new student("amit",89,90);
call only one  constructor in main method*/
package PracticeAssignmentDEC15;

public class student {

    public student(){
        System.out.println("Default Constructor");
    }
    public student(int a,int b){
        this();
        System.out.println(a+" "+b);
    }
    public student(String a,int b ,int c){
        this(40,50);
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        student st = new student("Pune",12,14);
    }
}

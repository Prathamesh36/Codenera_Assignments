/*Q3.Implement a Java program to demonstrate inheritance by creating a subclass "Student" with
additional attributes and methods.*/
package Test9;

class Student{
    int id = 543;
    String name ="Prathamesh";
    char division='A';
    int age =15;
    public void marks(){
        System.out.print("Total Marks: 450");
    }
}

public class InheritStudent extends Student{
    public static void main(String[] args) {
        InheritStudent ob = new InheritStudent();
        System.out.println("ID is: "+ob.id);
        System.out.println("Name is: "+ob.name);
        System.out.println("Division is: "+ob.division);
        System.out.println("Age is: "+ob.age);
        ob.marks();
    }
}
/************************OUTPUT 1*****************************
 ID is: 543
 Name is: Prathamesh
 Division is: A
 Age is: 15
 Total Marks: 450
 ************************************************************/
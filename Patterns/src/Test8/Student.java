/*10.Create a Java class "Person" with attributes name, age, and address. Create a subclass "Student" that
 inherits from "Person" and adds attributes like roll number and grade.
*/
package Test8;

class Person{
    String name="Prathamesh";
    int age=23;
    String Address="Shivneri_Colony";
}

public class Student extends Person {
    int rollNo=21;
    char grade='A';
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("Name: "+st.name);
        System.out.println("Age: "+st.age);
        System.out.println("Address: "+st.Address);
        System.out.println("RollNo: "+st.rollNo);
        System.out.println("Grade: "+st.grade);
    }
}
/***********************OUTPUT*************************
 Name: Prathamesh
 Age: 23
 Address: Shivneri_Colony
 RollNo: 21
 Grade: A
 *****************************************************/
/*Create a class Person with attributes name, age, and gender and methods to display the details of the person.
Implement subclasses Student, Teacher, and Staff that inherit from the Person class.*/
package OCT30.TejasSir;

class Person{
    String name;
    int age;
    char gender;
    static String School_name="SPPU";
    Person(String name,int age,char gender){
        this.name= name;
        this.age=age;
        this.gender=gender;
    }

    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}

class Student1 extends Person{
    char div;
    int id;
    Student1(String name,int age,char gender,char div,int id){
        super(name,age,gender);
        this.div=div;
        this.id=id;
    }
    public void details(){
        System.out.println("Student ID is: "+id);
        System.out.println("Student name is: "+name);
        System.out.println("Student gender is: "+gender);
        System.out.println("Student age is: "+age);
        System.out.println("Student Division is: "+div);
    }
}

class Staff extends Person{
    int exp;
    int id;
    Staff(String name,int age,char gender,int exp,int id){
        super(name,age,gender);
        this.exp=exp;
        this.id=id;
    }
    public void details(){
        System.out.println("Staff ID is: "+id);
        System.out.println("Staff name is: "+name);
        System.out.println("Staff gender is: "+gender);
        System.out.println("Staff age is: "+age);
        System.out.println("Staff Experience in years is: "+exp);
    }
}

class Teacher extends Person{
    int exp;
    int id;
    Teacher(String name,int age,char gender,int exp,int id){
        super(name,age,gender);
        this.exp=exp;
        this.id=id;
    }
    public void details(){
        System.out.println("Teacher ID is: "+id);
        System.out.println("Teacher name is: "+name);
        System.out.println("Teacher gender is: "+gender);
        System.out.println("Teacher age is: "+age);
        System.out.println("Teacher Experience in years is: "+exp);
    }
}

public class Super_PersonInfo {
    public static void main(String[] args) {
        Student1 ob = new Student1("Prathamesh",23,'M','A',201);
        Teacher ob1 = new Teacher("Raju",45,'M',12,445);
        Staff ob2 = new Staff("Mohan",31,'M',1,352);
        ob.details();
        System.out.println();
        ob1.details();
        System.out.println();
        ob2.details();
    }
}

/*Create a class Person with attributes name, age, and gender and methods to display the details of the person.
 Implement subclasses Student, Teacher, and Staff that inherit from the Person class.*/
package NOV3.TejasSir;

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);;
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
class Student extends Person{
    String name;
    int age;
    int gender;
    Student(String name, int age, char gender){
        super(name,age,gender);
    }
    public void details(){
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student Gender: "+gender);
    }
}
class Teacher extends Person{
    String name;
    int age;
    int gender;
    Teacher(String name, int age, char gender){
        super(name,age,gender);
    }
    public void details(){
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher age: "+age);
        System.out.println("Teacher Gender: "+gender);
    }
}
class Staff extends Person{
    String name;
    int age;
    int gender;
    Staff(String name, int age, char gender){
        super(name,age,gender);
    }
    public void details(){
        System.out.println("Staff name: "+name);
        System.out.println("Staff age: "+age);
        System.out.println("Staff Gender: "+gender);
    }
}

public class PersonDetails {
    public static void main(String[] args) {

    }
}

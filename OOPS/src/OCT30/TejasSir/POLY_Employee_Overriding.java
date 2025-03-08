/*4. Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary()
method to calculate and return the salary based on their specific roles.
*/
package OCT30.TejasSir;


class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    public int calculateSalary(){
        return 50000;
    }
    public void disp(){
        System.out.println("Emp name "+name);
        System.out.println("Emp salary "+calculateSalary());
    }
}
class Manager extends Employee{
    int bonus;
    Manager(String name,int bonus){
        super(name);
        this.bonus=bonus;
    }
    public int calculateSalary(){
        return 50000+bonus;
    }
}
class Programmer extends Employee{
    int noOfProject;
    Programmer(String name,int noOfProject){
        super(name);
        this.noOfProject=noOfProject;
    }
    public int calculateSalary(){
        return 50000+(noOfProject*500);
    }
}

public class POLY_Employee_Overriding {
    public static void main(String[] args) {
        Manager ob = new Manager("Prathamesh",10000);
        Programmer ob1 = new Programmer("Satish",3);

        ob.disp();
        System.out.println();
        ob1.disp();
    }
}

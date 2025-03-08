/*Q2.Create a Java class representing a "Person" with attributes like name, age,
and address. Write a constructor and getter methods for this class.*/
package Test9;

import java.util.Scanner;

class Person {
    private String Name;
    private int Age;
    private String Address;

    public Person(String Name, int Age, String Address) {
        this.Name = Name;
        this.Age=Age;
        this.Address=Address;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public String getAddress() {
        return Address;
    }
}

public class PersonDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String Name=sc.next();
        System.out.print("Enter Age: ");
        int Age=sc.nextInt();
        System.out.print("Enter Address: ");
        String Address=sc.next();
        Person ob = new Person(Name,Age,Address);
        System.out.println("**********Person Details********");
        System.out.println("Name is: "+ob.getName());
        System.out.println("Age is: "+ob.getAge());
        System.out.println("Address is: "+ob.getAddress());
        System.out.println("********************************");
    }
}
/************************OUTPUT 1*****************************

 Enter name: Prathamesh
 Enter Age: 23
 Enter Address: Codenera_Ground
 **********Person Details********
 Name is: Prathamesh
 Age is: 23
 Address is: Codenera_Ground
 ********************************

 ************************************************************/
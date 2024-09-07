/*4.Create a class called "Person" with attributes name and address.
 Implement a method to compare two persons based on their names and addresses
 and return true if they are equal.*/
package HolidayAssignment.OOPS;

import java.util.Scanner;

class Person{
    String name;
    String address;

    Person(String name,String address){
        this.name=name;
        this.address=address;
    }

}

public class CompareTwoPersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Enter Two Person information***");
        System.out.print("Enter Person 1 name: ");
        String name = sc.nextLine();
        System.out.print("Enter Person 1 Address: ");
        String address = sc.nextLine();
        Person ob = new Person(name, address);
        System.out.print("Enter Person 2 name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Person 2 Address: ");
        String address1 = sc.nextLine();
        Person ob1 = new Person(name1, address1);
        if(ob.name.equals(ob1.name) && ob.address.equals(ob1.address)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
/***********************OUTPUT************************
 ***Enter Two Person information***
 Enter Person 1 name: Prathamesh
 Enter Person 1 Address: 32 Laxmi Nagar Nagpur
 Enter Person 2 name: Prathamesh
 Enter Person 2 Address: 32 Laxmi Nagar Nagpur
 True
 ****************************************************/

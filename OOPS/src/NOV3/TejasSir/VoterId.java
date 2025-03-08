/*Create a Java class called VoterID to represent a voter's identification.

Add the following attributes to the VoterID class:

id: An identifier for the voter ID (you can use a unique number or string).
name: The name of the voter, limited to a maximum of 10 characters.
age: The age of the voter.
country: The country of residence.
Implement encapsulation by making the attributes private and providing getter and setter methods for accessing and modifying them.

Apply the following conditions to the VoterID class:

Age must be a greater then 18.
The name must not exceed 10 characters in length.
The voter must belong to India (set country to "India").*/
package NOV3.TejasSir;

import java.util.Scanner;

class VoterIDd {
    private int ID;
    private String Name;
    private int Age;
    private String Country;

    VoterIDd(int ID, String name, int age, String country) {
        setID(ID);
        setName(name);
        setAge(age);
        setCountry(country);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length()<=10) {
            Name = name;
        }
        else {
            Name="Character Limit exceed";
        }
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age>=18) {
            Age = age;
        }
        else{
            Age=0;
        }
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        if(country.equals("India")){
            Country = country;
        }
        else{
            Country="You are not INDIAN";
        }

    }
}
public class VoterId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=1;
        while (k < 3) {
            System.out.print("Enter your ID: ");
            int n = sc.nextInt();
            System.out.print("Enter Your Name: ");
            String name= sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Country: ");
            String con = sc.next();
            VoterIDd ac = new VoterIDd(n,name,age,con);
            ac.setID(n);
            ac.setName(name);
            ac.setAge(age);
            ac.setCountry(con);
            System.out.println("*********Account Details***********");
            System.out.println("ID: "+ac.getID());
            System.out.println("Name: "+ac.getName());
            if(ac.getAge()==0){
                System.out.println("Age: only 18+ Allowed");
            }else{
                System.out.println("Age: "+ac.getAge());
            }
            System.out.println("Country: "+ac.getCountry());
            System.out.println("***********************************");
            k++;
        }



    }
}

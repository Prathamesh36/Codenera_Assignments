/*Implement the Comparable interface for a Person class that compares instances based on their age.*/
package JAN3;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
   /* return this.age.compareTo(otherPerson.age);*/

}
public class CompareBasedOnAgeUsingComparable {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        ob.add(new Person("Prathamesh",23));
        ob.add(new Person("Vishal",24));
        ob.add(new Person("Naresh",26));
        ob.add(new Person("Ali",56));
        Collections.sort(ob);
        System.out.println("Sorting Based on age: ");
        System.out.println(ob);


    }
}

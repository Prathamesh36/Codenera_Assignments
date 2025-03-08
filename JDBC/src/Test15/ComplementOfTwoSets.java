/*Q10.
Develop a Java program that calculates the complement of one set concerning
another set. In this scenario, you are given two sets: Set X and Set Y. Your
task is to create a method that accepts these two sets as input and generates
a new set, let's call it the "complement set," that contains all the elements
from Set X that are not found in Set Y. Describe the algorithm and logic you
would use to create this complement set, ensuring that it doesn't contain any
duplicates.*/
package Test15;

import java.util.HashSet;

public class ComplementOfTwoSets {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(1);
        ob.add(2);
        ob.add(3);

        HashSet<Integer> ob1 = new HashSet<>();
        ob1.add(2);
        ob1.add(4);
        ob1.add(5);

        ob.removeAll(ob1);
        System.out.print("The complement of set1 with respect to set2 is: "+ob);
    }
}
/*****************************OUTPUT******************************
 The complement of set1 with respect to set2 is: [1, 3]
 ******************************************************************/
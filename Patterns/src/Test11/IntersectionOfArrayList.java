/*12. Write a Java program that finds the intersection of two ArrayLists without using built-in functions.*/
package Test11;

import java.util.ArrayList;

public class IntersectionOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(60);
        ob.add(22);
        ob.add(39);
        ob.add(40);
        ob.add(90);
        System.out.println(ob);
        ArrayList<Integer> ob1 = new ArrayList<Integer>();
        ob1.add(35);
        ob1.add(90);
        ob1.add(60);
        ob1.add(42);
        ob1.add(65);
        System.out.println(ob1);
        ArrayList<Integer> ob2 = new ArrayList<Integer>();
        for (int i = 0; i < Math.max(ob.size(),ob1.size()); i++) {
            if(ob.contains(ob1.get(i))){
                ob2.add(ob1.get(i));
            }
        }
        System.out.println("Intersection: "+ob2);
    }
}
/****************************OUTPUT***********************************
 [60, 22, 39, 40, 90]
 [35, 90, 60, 42, 65]
 Intersection: [90, 60]
 *********************************************************************/
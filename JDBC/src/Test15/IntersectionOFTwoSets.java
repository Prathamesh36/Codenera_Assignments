/*Q9.
Implement a Java function that computes the intersection of two sets.
 The goal is to find common elements between the two sets without utilizing
  any built-in Set methods or creating additional data structures. Your function
  should take two sets as input, let's call them Set A and Set B, and return
  a new set that contains only those elements that appear in both Set A and Set B.
   Explain the logic and steps you would follow to achieve this, ensuring that the
    resulting set contains unique elements.*/
package Test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOFTwoSets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(3);
        hs.add(3);
        hs.add(1);
        HashSet<Integer> hs1= new HashSet<>();
        hs1.add(2);
        hs1.add(3);
        hs1.add(6);
        hs1.add(1);
        hs1.add(0);
        hs1.add(8);
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int el : hs) {
            hashMap.put(el, 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int el : hs1) {
            if (hashMap.containsKey(el)) {
                set.add(el);
            }
        }
        System.out.println("Intersection of two sets: " + set);
    }
}
/*****************************OUTPUT******************************
 Intersection of two sets: [1, 3, 6, 8]
******************************************************************/
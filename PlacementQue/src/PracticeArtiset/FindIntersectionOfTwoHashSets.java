package PracticeArtiset;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersectionOfTwoHashSets {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        HashSet<Integer> intersection = new HashSet<>(hs1);
        for (Integer el : hs1){
            if(hs2.contains(el)){
                intersection.add(el);
            }
        }
        System.out.println("Intersection: "+intersection);
    }
}

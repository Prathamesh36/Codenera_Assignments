/*Write a program to convert a HashSet to an ArrayList.*/
package PlacementQue.CollectionQues;

import java.util.ArrayList;
import java.util.HashSet;

public class Q9_ConvertHashSetToArrayList {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(18);
        ob.add(26);
        ob.add(55);
        System.out.println("Hash Set: "+ob);
        ArrayList<Integer> al = new ArrayList<>(ob);
        System.out.println("ArrayList: "+al);

    }
}
/**************************OUTPUT*****************************
 Hash Set: [65, 82, 18, 55, 26, 30]
 ArrayList: [65, 82, 18, 55, 26, 30]
 ************************************************************/

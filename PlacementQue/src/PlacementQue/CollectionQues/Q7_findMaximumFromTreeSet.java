/*Write a program to find the maximum value in a TreeSet.*/
package PlacementQue.CollectionQues;

import java.util.TreeSet;

public class Q7_findMaximumFromTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(65);
        ob.add(30);
        ob.add(82);
        ob.add(18);
        ob.add(26);
        ob.add(55);
        System.out.println("Tree Set: "+ob);
        System.out.println("Maximum Element: "+ob.last());
    }
}
/**************************OUTPUT*****************************
 Tree Set: [18, 26, 30, 55, 65, 82]
 Maximum Element: 82
 ************************************************************/

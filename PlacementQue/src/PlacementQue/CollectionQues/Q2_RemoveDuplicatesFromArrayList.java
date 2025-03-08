/*Write a program to remove duplicates from an ArrayList.*/
package PlacementQue.CollectionQues;

import java.util.ArrayList;

public class Q2_RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(5);
        ob.add(7);
        ob.add(3);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        System.out.println("ArrayList: "+ob);
        for (int i = 0; i < ob.size(); i++) {
            for (int j = i+1; j <ob.size() ; j++) {
                if(ob.get(i).equals(ob.get(j))){
                    ob.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing Duplicate Elements: "+ob);
    }
}
/****************************OUTPUT***********************************
 ArrayList: [5, 6, 5, 7, 3, 5, 6, 7]
 After Removing Duplicate Elements: [5, 6, 7, 3]
 *********************************************************************/

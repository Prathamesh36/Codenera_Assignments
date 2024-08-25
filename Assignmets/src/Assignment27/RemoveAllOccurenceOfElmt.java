/*13.Remove all occurrences of a specific element from an ArrayList.*/
package Assignment27;

import java.util.ArrayList;

public class RemoveAllOccurenceOfElmt {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(20);
        ob.add(15);
        ob.add(10);
        ob.add(15);
        ob.add(30);
        ob.add(15);
        System.out.println("ArrayList: "+ob);
        Integer[] ob1 = (Integer[]) ob.toArray();
        System.out.print("Array: ");
        for (Object el:ob1) {
            System.out.print(el+" ");
        }
    }
}

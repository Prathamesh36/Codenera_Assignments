/*11.Convert an ArrayList to an array.*/
package Assignment27;

import java.util.ArrayList;

public class ConverArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("ArrayList: "+ob);
        Object[] ob1 = ob.toArray();
        System.out.print("Array: ");
        for (Object el:ob1) {
            System.out.print(el+" ");
        }
    }
}
/**************************OUTPUT*****************************
 ArrayList: [5, 6, 8, 7, 3, 4]
 Array: 5 6 8 7 3 4
 ************************************************************/
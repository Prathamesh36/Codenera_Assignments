/*15.Write a function to find the minimum element in an ArrayList.*/
package Assignment27;

import java.util.ArrayList;

public class FindMinimumElement {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(20);
        ob.add(15);
        ob.add(10);
        ob.add(30);
        int min = 999;
        for (int i = 0; i < ob.size(); i++) {
            if(ob.get(i)<min) min=ob.get(i);
        }
        System.out.print("Minimum Element in ArrayList: "+min);
    }
}
/**************************OUTPUT*****************************
 Minimum Element in ArrayList: 10
 ************************************************************/
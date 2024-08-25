/*5.Write a function to find the maximum element in an ArrayList.*/
package Assignment27;

import java.util.ArrayList;

public class FindMaximumElmtInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        int max = ob.get(0);
        for (int i = 0; i < ob.size(); i++) {
            if(max>ob.get(i)) max=ob.get(i);
        }
        System.out.print("Maximum Element in ArrayList: "+max);
    }
}
/**************************OUTPUT*****************************
 Maximum Element in ArrayList: 3
 ************************************************************/
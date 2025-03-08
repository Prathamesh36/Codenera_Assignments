package JAN30;

import java.util.ArrayList;
import java.util.Arrays;

public class AvgOfArrayAndNumbersGreaterThanAvg {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Array: "+ Arrays.toString(a));
        int avg = 0;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        avg = sum/a.length;
        System.out.println("Average: "+avg);
        ArrayList<Integer> ob= new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>avg) ob.add(a[i]);
        }
        System.out.println("Number greater than average: "+
                Arrays.toString(ob.toArray()));
    }
}

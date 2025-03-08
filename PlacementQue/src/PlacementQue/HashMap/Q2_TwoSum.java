/*Two Sum:
2. Given an array of integers and a target sum, find the indices of two numbers that add up to the
 target using a HashMap.*/
package PlacementQue.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Q2_TwoSum {
    public static void main(String[] args) {
        int[] a = {5,4,2,7,8,3};
        int target = 6;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans[]= new int[2];
        for (int i = 0; i < a.length; i++) {
            if(mp.containsKey(target-a[i])){
                ans[0]=mp.get(target-a[i]);
                ans[1]=i;
            }
            mp.put(a[i],i);
        }
        System.out.println("Array: "+ Arrays.toString(a));
        System.out.println("Target Sum: "+target);
        System.out.println("OUTPUT: "+ Arrays.toString(ans));
    }
}
/************************OUTPUT****************************
 Array: [5, 4, 2, 7, 8, 3]
 Target Sum: 6
 OUTPUT: [1, 2]
 *********************************************************/
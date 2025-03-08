package PlacementQue.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q5_IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int[] b= {4,5,6,7,8};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!hm.containsKey(a[i])) {
                hm.put(a[i], 1);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(hm.containsKey(b[i])) {
                hm.put(b[i], hm.get(b[i])+1);
            }
        }
        ArrayList<Integer> al =  new ArrayList<>();
        for (Integer el : hm.keySet()){
            if(hm.get(el)>1){
                al.add(el);
            }
        }
        System.out.println("Array 1: "+ Arrays.toString(a));
        System.out.println("Array 2: "+Arrays.toString(b));
        System.out.println("OUTPUT: "+al);
    }
}
/************************OUTPUT****************************
 Array 1: [1, 2, 3, 4, 5]
 Array 2: [4, 5, 6, 7, 8]
 OUTPUT: [4, 5]
 *********************************************************/
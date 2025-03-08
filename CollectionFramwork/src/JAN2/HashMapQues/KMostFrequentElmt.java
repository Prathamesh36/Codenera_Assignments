/*4.
Given an array, find the k most frequent elements using a HashMap.
*/
package JAN2.HashMapQues;

import java.util.*;

public class KMostFrequentElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(mp.containsKey(a[i])) mp.put(a[i],mp.get(a[i])+1);
            else mp.put(a[i],1);
        }
        /*int[] z = new int[9];

        for (Integer g: mp.keySet()) {
            z[g]=mp.get(g);
        }
        //System.out.println(Arrays.toString(z));*/




    }
}

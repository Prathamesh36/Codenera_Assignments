/*8.	Given two arrays, write a program to find their intersection using a HashMap.
*/
package DEC27;

import java.util.HashMap;
import java.util.Scanner;

public class findInsertionOfArraysUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array 1 size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your Array 2 size: ");
        int n1 = sc.nextInt();
        int[] b = new int[n1];
        System.out.print("Enter Array 2 elements: ");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!hm.containsKey(a[i])){
                hm.put(a[i],1);
            }
        }
        for (int i = 0; i <b.length; i++) {
            if(hm.containsKey(b[i])){
                hm.put(b[i],hm.get(b[i])+1);
            }
        }
        System.out.print("Intersection: ");
        for (var el:hm.keySet()) {
           if(hm.get(el)>1){
               System.out.print(el+" ");
           }
        }

    }
}

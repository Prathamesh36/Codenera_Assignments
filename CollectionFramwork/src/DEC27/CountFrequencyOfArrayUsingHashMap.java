/*2.	Given an array of integers, write a program to count the frequency of each number using a HashMap.
*/
package DEC27;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequencyOfArrayUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i <a.length; i++) {
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }
            else {
                hm.put(a[i],1);
            }
        }
        System.out.println("Numbers\tFrequency");
        for (var el:hm.keySet()) {
            System.out.println(el+"\t\t"+hm.get(el));
        }

    }
}

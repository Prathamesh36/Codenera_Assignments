/*5.	Write a program to read a file and count the occurrences of each word using a Map.*/
package Test17;

import java.util.HashMap;

public class Q5_CountOccurrence {
    public static void main(String[] args) {
        String b = "java python c++ java java react c++ python";
        HashMap<String,Integer> mp = new HashMap<>();
        String[] a= b.split(" ");
        for (int i = 0; i < a.length; i++) {

            if(mp.containsKey(a[i])) mp.put(a[i],mp.getOrDefault(a[i],mp.get(a[i]))+1);
            else mp.put(a[i],1);
        }
        System.out.println("word\tFrequency ");
        for (String s:mp.keySet()) {
            System.out.println(s+" : "+mp.get(s));
        }
    }
}
/***************************OUTPUT******************************
 word	Frequency
 python : 2
 c++ : 2
 java : 3
 react : 1
 ****************************************************************/
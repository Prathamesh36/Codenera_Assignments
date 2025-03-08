/*
1. Word Frequency Counter:
Write a program to count the frequency of each word in a given text using a HashMap.*/
package PlacementQue.HashMap;

import java.util.HashMap;

public class Q1_WordFrequencyCounter {
    public static void main(String[] args) {
        String b = "java python c++ java java c++";
        HashMap<String,Integer> mp= new HashMap<>();
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
/************************OUTPUT****************************
 word	Frequency
 python : 1
 c++ : 2
 java : 3
 *********************************************************/
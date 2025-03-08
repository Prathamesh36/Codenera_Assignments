/*Question.

Write a Java program that takes an array of strings and finds the frequency of each word using a HashMap.

Implement a method with the following signature

public static Map<String, Integer> findWordFrequency(String[] words)


1. Implement the findWordFrequency method to efficiently calculate the frequency of each unique word in the provided array.

2. Ensure your solution is modular, well-commented, and follows Java coding conventions.

Example Usage:

String[] wordsArray = {"apple", "banana", "orange", "apple", "grape", "banana","apple"};*/
package DEC26;

import java.util.HashMap;

public class FindFrequencyOfStringArrayUsingHashMap {
    public static void main(String[] args) {
        String[] a = {"apple", "banana", "orange", "apple", "grape", "banana","apple"};
        HashMap<String,Integer> mp = new HashMap<>();
        /*for (int i = 0; i < a.length; i++)
            if(mp.containsKey(a[i])) mp.put(a[i],mp.get(a[i])+1);
            else mp.put(a[i],1);
        }
        System.out.println("Frequency: ");
        for (String s:mp.keySet()) {
            System.out.println(s+" : "+mp.get(s));
        }*/
        for (int i = 0; i < a.length; i++) {

            if(mp.containsKey(a[i])) mp.put(a[i],mp.getOrDefault(a[i],mp.get(a[i]))+1);
            else mp.put(a[i],1);
        }
        System.out.println("Frequency: ");
        for (String s:mp.keySet()) {
            System.out.println(s+" : "+mp.get(s));
        }
    }
}

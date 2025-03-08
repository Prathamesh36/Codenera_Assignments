/*Q2.Anagram Checker:
Implement a function that takes two strings as input and determines whether they are
anagrams. Utilize a HashMap to compare character frequencies in both strings.*/
package DEC26;

import java.util.HashMap;

public class AnagramChecker {

    public static boolean check(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Character ch = a.charAt(i);
            Character ch1 = b.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            mp.put(ch1,mp.getOrDefault(ch1,0)-1);
        }
        for (Integer x : mp.values()) {
            if(x!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "apple";
        String b = "eplpa";
        System.out.println("String 1: "+a);
        System.out.println("String 2: "+b);
        System.out.println("Anagram check: "+check(a,b));

    }
}

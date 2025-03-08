/*Write a function to check if two strings are anagrams (contain the same characters in any order).*/
package PlacementQue.StringQues;

import java.util.HashMap;
import java.util.Scanner;

public class Q6_CheckTwoStringAreAnagram {

    public static boolean anagramCheck(String a,String b){
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String 1: ");
        String a = sc.nextLine();
        System.out.print("Enter your String 2: ");
        String b = sc.nextLine();
        if(anagramCheck(a,b)) System.out.println("Both String are Anagram");
        else System.out.println("Both String are not Anagram");
    }
}
/*******************************OUTPUT********************************
 Enter your String 1: race
 Enter your String 2: care
 Both String are Anagram
 **********************************************************************/
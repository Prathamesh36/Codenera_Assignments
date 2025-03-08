package ThinkitiveTechPractive;

import java.util.HashMap;
import java.util.Scanner;

public class CheckStringIsomorphicOrNot {

    public static boolean isIsomorphic(String s1,String s2){
        HashMap<Character,Character> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(hm.containsKey(s1.charAt(i))){
                if(hm.get(s1.charAt(i))!=s2.charAt(i)){
                    return false;
                }
            }
            hm.put(s1.charAt(i),s2.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s1 = sc.next();
        System.out.print("Enter your String: ");
        String s2 = sc.next();
        System.out.println("OUTPUT: "+isIsomorphic(s1,s2));
    }
}

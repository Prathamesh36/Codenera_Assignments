package FEB1;

import java.util.HashMap;
import java.util.Scanner;

public class Q2_characterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(Character ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        System.out.println("Frequency: "+hm);
    }
}
/**********************OUTPUT***************************
 Enter your String: google.com
 Frequency: {c=1, e=1, g=2, l=1, m=1, .=1, o=3}
 ********************************************************/
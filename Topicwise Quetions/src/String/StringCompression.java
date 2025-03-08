package String;

import java.util.HashMap;
import java.util.Scanner;
/*
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.next();
        int first = 0;
        int second = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (second < n.length()) {
            if (n.charAt(first) == n.charAt(second)) {
                count++;
                second++;
            } else if (n.charAt(first) != n.charAt(second)) {
                sb.append(n.charAt(first));
                sb.append(count);
                count = 0;
                first = second;
            }
            if (second == n.length()) {
                sb.append(n.charAt(first));
                sb.append(count);
            }
        }
        System.out.print("OUTPUT: " + sb);
    }
}
/************************OUTPUT*************************
 Enter String: aaabbcddaaa
 OUTPUT: a3b2c1d2a3
 ********************************************************/
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(Character ch : n.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        System.out.print("OUTPUT: ");
        for (Character el : hm.keySet()){
            System.out.print(el+""+hm.get(el));
        }
    }
}
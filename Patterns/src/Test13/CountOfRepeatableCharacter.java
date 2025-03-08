/*Q5.Create a Java program to perform basic string compression using the counts of repeated characters. For example,
the string "aabcccccaaa" would become "a2b1c5a3".*/
package Test13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfRepeatableCharacter {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n= sc.next();
        int first =0 ;
        int second=0;
        int count =0;
        StringBuilder  sb = new StringBuilder();
        while(second<n.length()){
            if(n.charAt(first)==n.charAt(second)){
                count++;
                second++;
            }
            else if(n.charAt(first)!=n.charAt(second)){
                sb.append(n.charAt(first));
                sb.append(count);
                count=0;
                first=second;
            }
            if (second==n.length()){
                sb.append(n.charAt(first));
                sb.append(count);
            }
        }
         System.out.print("OUTPUT: "+sb);
    }

    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n= sc.next();
        Map<Character,Integer> map = new LinkedHashMap<>();;
        for (int i = 0; i < n.length(); i++) {
            if(map.get(n.charAt(i))!=null){
                map.put(n.charAt(i),map.get(n.charAt(i))+1);
            }
            else{
                map.put(n.charAt(i),1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }

        System.out.print(sb);
    }*/
}
/************************OUTPUT*************************
 Enter String: aaabbcddaaa
 OUTPUT: a3b2c1d2a3
 ********************************************************/

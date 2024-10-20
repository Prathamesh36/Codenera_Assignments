/*
9.	Write a program to check if two given strings are isomorphic using a HashMap.
*/
package DEC27;

import java.util.HashMap;
import java.util.Scanner;

public class GivenStringAreIsoMorphicOrNotUsingHM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String n = sc.next();
        System.out.print("Enter String 2: ");
        String m = sc.next();
        int c=0;
        HashMap<Character,Character> hm = new HashMap<>();
        for (int i = 0; i < n.length(); i++) {
            Character cn = n.charAt(i);
            Character cm = m.charAt(i);
            if(hm.containsKey(cn)){
                if(hm.get(cn)!=cm){
                    c++;
                    break;
                }
            }
            else if(hm.containsValue(cm)){
                c++;
                break;
            }
            else {
                hm.put(cn,cm);
            }
        }
        if(c!=0){
            System.out.print("String are not Isomorphic");
        }
        else{
            System.out.print("String are Isomorphic");
        }
    }
}

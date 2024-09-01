/*1) Wap to find the uncommon characters between two Strig? */
package Assignment31;

import java.util.Scanner;

public class FindUncommonCharBtw2Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String a = sc.next();
        System.out.println("Enter String 2: ");;
        String b = sc.next();
        String s = "";
        for (int i = 0; i < a.length(); i++) {
            if(!b.contains(String.valueOf(a.charAt(i))) && !s.contains(String.valueOf(a.charAt(i)))){
                s+=a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(!a.contains(String.valueOf(b.charAt(i))) && !s.contains(String.valueOf(b.charAt(i)))){
                s+=b.charAt(i);
            }
        }
        System.out.println("Uncommon Character: "+s);

    }
}
/***************************OUTPUT*******************************
 Enter String 1: geeksforgeeks
 Enter String 2: geeksquiz
 Uncommon Character: forquiz
*****************************************************************/

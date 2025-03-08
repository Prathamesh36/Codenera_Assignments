/*6. Write a Java program to add 'ing' at the end of a given string (length should be at least 3). If the given string already ends with 'ing', add 'ly' instead. If the string length of the given string is less than 3, leave it unchanged.
Sample String : 'abc'
Expected Result : 'abcing'
Sample String : 'string'
Expected Result : 'stringly'*/
package FEB1;

import java.util.Scanner;

public class Q6_Add_ing_AtEndOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        if(s.length()>=3) {
            if (s.endsWith("ing")) {
                s+="ly";
            } else {
                s+="ing";
            }
        }
        System.out.println("Output: "+s );
    }
}
/**********************OUTPUT***************************
 Enter your String: abc
 Output: abcing

 Enter your String: string
 Output: stringly
 ********************************************************/
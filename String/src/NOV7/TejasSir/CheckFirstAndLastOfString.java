/*Write a Java program to read a given string and if the first or last characters are same
    return the string without those characters otherwise return the string unchanged.
    Sample Output:
    The given strings is: testcricket
    The new string is: estcricke*/
package NOV7.TejasSir;

import java.util.Scanner;

public class CheckFirstAndLastOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("OUTPUT: ");
            char ch = s.charAt(0);
            char ch1 = s.charAt(s.length()-1);
            if(ch!=ch1){
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(s.charAt(i));
                }
            }
            else{
                for (int i = 1; i < s.length()-1; i++) {
                    System.out.print(s.charAt(i));
                }
            }

    }
}

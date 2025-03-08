/*Q4.Write a Java program to remove first occurrence of a character from string.
*/
package NOV7.TejasSir;

import java.util.Scanner;
public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter Character: ");
        char a = sc.next().charAt(0);
       // System.out.print("OUTPUT: ");
        int k=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == a){
               k=i;
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if(i==k){
                continue;
            }
            else{
                System.out.print(ch);
            }
        }
    }
}

/*Q11. String s1="Hello India"
     Output: EO IIA*/
package Assignment23;

import java.util.Scanner;

public class PrintOnlyVowelsFromWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("OUTPUT: ");
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='I'|| ch=='o' || ch=='u'){
                System.out.print(Character.toUpperCase(ch));
            }
            else if(ch==' ')
            {
                System.out.print(" ");
            }
        }
    }
}
/*********************OUTPUT************************
 Enter your String: Hello India
 OUTPUT: EO IIA
 ***************************************************/
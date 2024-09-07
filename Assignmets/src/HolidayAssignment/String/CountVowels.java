/*23.	Write a function to count the number of vowels in a string.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='I'|| ch=='o' || ch=='u'){
                c++;
            }
        }
        System.out.print("Vowel count: "+c);
    }
}
/************************OUTPUT****************************
 Enter your String: Codenera
 Vowel count: 4
 *********************************************************/
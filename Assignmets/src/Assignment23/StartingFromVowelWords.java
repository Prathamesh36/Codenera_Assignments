/*Q7. WAP print all the words of String that are starting from vowel character.*/
package Assignment23;

import java.util.Scanner;

public class StartingFromVowelWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.println("Words starting from vowels: ");
        for (int i = 0; i < a.length; i++) {
            String s1= a[i];
            char ch=s1.charAt(0);
            if(ch=='a' || ch=='e' || ch=='o'||ch=='u'||ch=='i'){
                System.out.println(s1);
            }
        }
    }
}
/*********************OUTPUT************************
 Enter your String: i am from india and
 Words starting from vowels:
 i
 am
 india
 and
 ***************************************************/
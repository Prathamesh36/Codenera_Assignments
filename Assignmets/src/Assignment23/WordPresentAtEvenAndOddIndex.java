/*Q2. WAP to print the all words that are present at even index and odd index*/
package Assignment23;

import java.util.Scanner;

public class WordPresentAtEvenAndOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("Word present at Even index: ");
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.print("\nWord present at Odd index: ");
        for (int i = 0; i < a.length; i++) {
            if(i%2==1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
/*********************OUTPUT************************
 Enter your String: java is object oriented language
 Word present at Even index: java object language
 Word present at Odd index: is oriented
 ****************************************************/

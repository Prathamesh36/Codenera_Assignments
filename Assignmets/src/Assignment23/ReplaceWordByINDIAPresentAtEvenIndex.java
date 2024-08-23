/*Q8. WAP to replace all the words by INDIA that are prensent at even index.*/
package Assignment23;

import java.util.Scanner;

public class ReplaceWordByINDIAPresentAtEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                a[i]="INDIA";
            }
        }
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
/*********************OUTPUT************************
 Enter your String: java is object oriented and secure language
 OUTPUT: INDIA is INDIA oriented INDIA secure INDIA
 ***************************************************/
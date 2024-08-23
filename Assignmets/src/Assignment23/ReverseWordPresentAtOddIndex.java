/*Q5. WAP to reverse the word that are present at odd index.*/
package Assignment23;

import java.util.Scanner;

public class ReverseWordPresentAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.println("Reverse words present at odd index: ");
        for (int i = 0; i < str.length ; i++) {
            if(i%2==1) {
                String a = str[i];
                str[i]="";
                char[] b = a.toCharArray();
                for (int j = b.length - 1; j >= 0; j--) {
                    str[i]+=b[j];
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
/*********************OUTPUT************************
 Enter your String: java is object oriented language
 Reverse words present at odd index:
 java si object detneiro language
 ****************************************************/
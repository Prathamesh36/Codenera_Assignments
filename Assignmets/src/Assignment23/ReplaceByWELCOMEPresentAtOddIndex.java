/*Q9. WAP to replace all the words by welcome that are presenta at odd position.*/
package Assignment23;

import java.util.Scanner;

public class ReplaceByWELCOMEPresentAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if(i%2==1){
                a[i]="WELCOME";
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
 OUTPUT: java WELCOME object WELCOME and WELCOME language
 ***************************************************/
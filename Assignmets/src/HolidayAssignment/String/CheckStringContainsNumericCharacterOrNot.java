/*30.	Write a function to check if a string contains only numeric characters.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class CheckStringContainsNumericCharacterOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int c=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>=48 && ch[i]<=57){
                c++;
            }
        }
        if(c==0){
            System.out.print("String not contains numeric characters");
        }
        else{
            System.out.print("String contains numeric characters");

        }
    }
}
/************************OUTPUT****************************
 Enter your String: Codenera123
 String contains numeric characters
 *********************************************************/
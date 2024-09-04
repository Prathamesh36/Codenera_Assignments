/*Q2. Delete alternate characters (Amazon)
Input: S = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

public class DeleteAlternateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.next();
        char[] ch = str.toCharArray();
        System.out.print("OUTPUT: ");
        for (int i = 0; i < ch.length; i++) {
            if(i%2==0){
                System.out.print(ch[i]);
            }
        }
    }
}
/***********************OUTPUT************************
 Enter Your String: Geeks
 OUTPUT: Ges
 ****************************************************/
/*28.	Write a function to remove all whitespace characters from a string.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class RemoveWhiteSpaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("After Removing White Space: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
/************************OUTPUT****************************
 Enter your String: I Am From Pune
 After Removing White Space: IAmFromPune
 *********************************************************/
/*Q20. Maximum number of characters between any two same character
Given a string containing lower and uppercase alphabets, the task is to find the maximum
number of characters between any two same characters in the string.
Example 1:
Input:
S = "socks"
Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class MaxChars{
    public void BetweenTwoChars(String a){
        char[] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j <ch.length ; j++) {

            }
        }
    }
}

public class MaxCharBtwToSameChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        MaxChars ob = new MaxChars();
        System.out.print("OUTPUT: ");
       // System.out.print(ob.BetweenTwoChars(str));
    }
}

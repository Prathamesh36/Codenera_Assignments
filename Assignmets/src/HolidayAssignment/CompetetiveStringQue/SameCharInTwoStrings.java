/*Q19. Same characters in two strings
Given two strings A and B of equal length, find how many times the corresponding position in
the two strings hold exactly the same character. The comparison should not be case sensitive.
Example 1:
Input:
A = choice
B = chancE
Output: 4
Explanation: characters at position 0, 1, 4 and 5
are the same in the two strings A and B.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class SameInTwoStrings{
    public int SameChar(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b.charAt(i)){
                count++;
            }
        }
        return count;
    }
}

public class SameCharInTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        System.out.print("Enter Your String: ");
        String str1 = sc.nextLine();
        SameInTwoStrings ob = new SameInTwoStrings();
        System.out.print("OUTPUT: ");
        System.out.print(ob.SameChar(str,str1));
    }
}
/***********************OUTPUT************************
 Enter Your String: choice
 Enter Your String: chancE
 OUTPUT: 4
 ****************************************************/
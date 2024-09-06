/*Q17. Replace a word
Example 1:
Input:
S = "xxforxx xx for xx"
oldW = "xx"
newW = "Geeks"
Output:
"geeksforgeeks geeks for geeks"
Explanation:
Replacing each "xx" with
"Geeks" in S.

Example 2:
Input:
S = "india is the xx country"
oldW = "xx"
newW = "best"
Output:
"india is the best country"
Explanation:
Replacing each "xx" with
"best" in S.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("Enter old word: ");
        String str = sc.next();
        System.out.print("Enter new word: ");
        String str1 = sc.next();
        String ans="";
        ans = s.replace(str,str1);
        System.out.print(ans);

    }
}
/***********************OUTPUT************************
 Enter your String: xxforxx xx for xx
 Enter old word: xx
 Enter new word: Geeks
 GeeksforGeeks Geeks for Geeks
 ****************************************************/
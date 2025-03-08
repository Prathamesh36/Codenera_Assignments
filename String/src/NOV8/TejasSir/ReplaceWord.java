/*Replace a word
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
"best" in S.*/
package NOV8.TejasSir;

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
        for (int i = 0; i < a.length; i++) {
           // String w = a[i];
            if(a[i].equals(str)){
                a[i]=str1;
            }
        }
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

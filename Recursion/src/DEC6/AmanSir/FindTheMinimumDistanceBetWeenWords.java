/*7) Find the minimum distance between the given two words

Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3

Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2*/
package DEC6.AmanSir;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMinimumDistanceBetWeenWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a ={"the", "quick", "brown", "fox", "quick"};
       // String[] a={"geeks","for","geeks","contribute","practice"};

        System.out.println( Arrays.asList(a));
        System.out.print("Enter first word: ");
        String x = sc.nextLine();
        System.out.print("Enter second word: ");
        String y = sc.nextLine();
        int flag1=0;
        int flag2=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(x)){
                flag1=i;
            }
            if(a[i].equals(y)){
                flag2=i;
            }
        }
        System.out.println("Minimum Distance: "+(flag2-flag1) );

    }
}

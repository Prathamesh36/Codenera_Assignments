/*Q3. Reverse words in a given string

     Input: s = “geeks quiz practice code”
    Output: s = “code practice quiz geeks”*/
package JAN2.ArrayQues;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a= s.split(" ");
        StringBuilder sb =new StringBuilder();
        for (int i = a.length-1; i >=0 ; i--) {
            sb.append(a[i]);
            sb.append(" ");
        }
        System.out.print("OUTPUT: "+sb);

    }
}
/*Enter your String: geeks quiz practice code
OUTPUT: code practice quiz geeks */
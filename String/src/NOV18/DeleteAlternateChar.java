/*Delete alternate characters (Amazon)
Input: S = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.*/
package NOV18;

import java.util.Scanner;

public class DeleteAlternateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.nextLine();
        char[] ch = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(i%2==0){
                sb.append(ch[i]);
            }
        }
        System.out.print(sb);
    }
}

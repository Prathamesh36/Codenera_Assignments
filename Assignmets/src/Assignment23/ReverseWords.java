/*Q3. Wap to reverse the word by word of String*/
package Assignment23;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("Output: ");
        for (int i = 0; i < a.length; i++) {
            char[] b = a[i].toCharArray();
            for (int j = b.length-1; j>=0; j--) {
                System.out.print(b[j]);
            }
            System.out.print(" ");
        }
    }
}
/*********************OUTPUT************************
 Enter your String: java is object oriented language
 Output: avaj si tcejbo detneiro egaugnal
 ****************************************************/
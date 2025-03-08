/*Q4.Write a Java program to remove first occurrence of a character from string.
*/
package NOV16.StringQues;

import java.util.Scanner;

public class RemoveFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        char[] b = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int k=0;
        for (int i = 0; i < b.length; i++) {
            if(ch==b[i] && k==0){
                k++;
                continue;

            }
            else{
                sb.append(b[i]);
            }
        }
        System.out.print("OUTPUT: "+sb);
    }
}

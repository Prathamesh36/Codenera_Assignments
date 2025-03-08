/*4. Write a Java program to get a string from a given string where all occurrences of its first char have been changed to '$', except the first char itself.
Sample String : 'restart'
Expected Result : 'resta$t'
*/
package FEB1;

import java.util.Scanner;

public class Q4_replaceOccOfFirstCharacterWith$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char fc = s.charAt(0);
        int idx=0;
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()){
            if(ch==fc && idx!=0){
                ans.append("$");
            }
            else{
                ans.append(ch);
                idx++;
            }
        }
        System.out.println("Output: "+ans);

    }
}
/**********************OUTPUT***************************
 Enter your String: restart
 Output: resta$t
 ********************************************************/
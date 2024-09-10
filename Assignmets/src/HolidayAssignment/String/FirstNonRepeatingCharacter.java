/*26.	Write a function to find the first non-repeating character in a string.
*/
package HolidayAssignment.String;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int c=1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ' && c==1){
                System.out.print("First Non repeating character: "+ch[i]);
                break;
            }


        }
    }
}
/************************OUTPUT****************************
 Enter your String: hello
 First Non repeating character: h
 *********************************************************/
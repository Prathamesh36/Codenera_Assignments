/*36.	Write a function to remove all duplicate characters from a string.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char[] ch = s.toCharArray();
        StringBuilder a=new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            int c=1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' '){
                a.append(ch[i]);
            }
        }
        System.out.print("OutPut: ");
        System.out.print(a);
    }
}
/************************OUTPUT****************************
 Enter your String: statement
 OutPut: staemn
 *********************************************************/
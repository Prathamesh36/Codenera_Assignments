/*27.	Write a function to convert a string to title case (capitalize the first letter of each word).*/
package HolidayAssignment.String;

import java.util.Scanner;

public class StringToTitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch =s.toCharArray();
        ch[0]=(char)(ch[0]-32);
        for (int i = 1; i < ch.length ; i++) {
            if(ch[i-1]==' '){
                ch[i]=(char)(ch[i]-32);
            }
        }
        String b = new String(ch);
        System.out.print("Title case: "+b);
    }
}
/************************OUTPUT****************************
 Enter your String: i am from pune
 Title case: I Am From Pune
 *********************************************************/
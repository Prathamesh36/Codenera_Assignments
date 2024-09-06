/*Q7. Print first letter of every word in the string (Zoho)
Input:
S = "geeks for geeks"
Output: gfg*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class FirstChar{
    public String First(String a){
        String[] str = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String b = str[i];
            sb.append(b.charAt(0));
        }
        return sb.toString();
    }
}

public class PrintFirstWordOfEveryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        FirstChar ob = new FirstChar();
        System.out.print("OUTPUT: ");
        System.out.print(ob.First(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: geeks for geeks
 OUTPUT: gfg
 ****************************************************/
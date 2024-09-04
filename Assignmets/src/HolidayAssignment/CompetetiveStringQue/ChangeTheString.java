/*Q9. Change the string (yahoo)
Input:
S = "abCD"
Output: abcd
Explanation: The first letter (a) is
lowercase. Hence, the complete string
is made lowercase.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class Change{
    public String changeString(String a){
        if(Character.isUpperCase(a.charAt(0))) return a.toUpperCase();
        return a.toLowerCase();
    }
}
public class ChangeTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        Change ob = new Change();
        System.out.print("OUTPUT: ");
        System.out.print(ob.changeString(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: abCD
 OUTPUT: abcd
 ****************************************************/
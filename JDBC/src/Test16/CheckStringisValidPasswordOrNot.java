/*Q2.Write a Java method to check whether a string is a valid password.

Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.*/
package Test16;

import java.util.Scanner;

public class CheckStringisValidPasswordOrNot {

    public static boolean check(String s){
        if(s.length()<8){
            return false;
        }
        int lc = 0;
        int dc = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                lc++;
            } else if (Character.isDigit(ch)) {
                dc++;
            } else {
                return false;
            }
        }
        if(!(lc > 0) && !(dc>=2)) return false;
    return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String s = sc.nextLine();
        check(s);
        if(check(s)) System.out.println("Valid Password");
        else System.out.println("Invalid Password");

    }
}
/******************************OUTPUT*******************************
 Enter your password: abcd1234
 Valid Password


 Enter your password: Prathamesh22
 Valid Password


 Enter your password: abc123
 Invalid Password
********************************************************************/
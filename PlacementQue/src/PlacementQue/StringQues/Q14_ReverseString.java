/*Write a function to reverse the order of words in a string.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q14_ReverseString {
    public static String reverse(String s){
        if(s.length()==0) return "";
        return reverse(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Reverse String: "+reverse(s));
    }
}
/*******************************OUTPUT********************************
 Enter your String: Statement
 Reverse String: tnemetatS
 **********************************************************************/
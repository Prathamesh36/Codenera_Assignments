/*Write a function to find the first non-repeating character in a string.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class  Q7_firstNonRepeatingCharacter {

    public static char firstNonRepeatingChar(String s){
        char ans=' ';
        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                ans = s.charAt(i);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("First Non-repeating Character is: "+firstNonRepeatingChar(s));
    }
}
/*******************************OUTPUT********************************
 Enter your String: collection
 First Non-repeating Character is: e
 **********************************************************************/
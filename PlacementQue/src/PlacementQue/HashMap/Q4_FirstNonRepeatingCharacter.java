/*4. First Non-Repeating Character:

Find the first non-repeating character in a string using a HashMap.
*/
package PlacementQue.HashMap;

import java.util.Scanner;

public class Q4_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []ch = s.toCharArray();
        int c=1;
        int max=0;
        char ans =' ';
        for (int i = 0; i < ch.length; i++) {
            c=1;
            for (int j = i+1; j < ch.length ; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(c==1){
                ans =ch[i];
                break;
            }
        }
        System.out.print("First non repeating character is: "+ans);

    }
}
/************************OUTPUT****************************
 Enter your String: aaabcac
 First non repeating character is: b
 *********************************************************/
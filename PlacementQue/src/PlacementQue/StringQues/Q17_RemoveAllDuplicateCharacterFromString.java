/*Write a function to remove all duplicate characters from a string.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q17_RemoveAllDuplicateCharacterFromString {

    public static String removeDuplicates(String s){
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
        return a.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("After removing Duplicate characters: "+ removeDuplicates(s));

    }
}
/*******************************OUTPUT********************************
 Enter your String: statement
 After removing Duplicate characters: staemn
 **********************************************************************/
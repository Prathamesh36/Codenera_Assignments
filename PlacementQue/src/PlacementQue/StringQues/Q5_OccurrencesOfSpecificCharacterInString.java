/*Write a function to count the occurrences of a specific character in a string.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q5_OccurrencesOfSpecificCharacterInString {

    public static int occurrence(String s,char k){
        int count=0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int c=1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ' && ch[i]==k){
                count=c;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter character to find occurrence: ");
        char k = sc.next().charAt(0);
        System.out.println("Occurrence of "+k+" is: "+occurrence(s,k));
    }
}
/*******************************OUTPUT********************************
 Enter your String: Statement
 Enter character to find occurrence: t
 Occurrence of t is: 3
 **********************************************************************/
/*31.	Write a function to find the most frequent character in a string.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int max=0;
        char most=' ';
        for (int i = 0; i < ch.length; i++) {
            int c=1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ' && c>max){
                max=c;
                most=ch[i];
            }
        }
        System.out.print("Most frequent character is: "+most);
    }
}
/************************OUTPUT****************************
 Enter your String: Codenera
 Most frequent character is: e
 *********************************************************/
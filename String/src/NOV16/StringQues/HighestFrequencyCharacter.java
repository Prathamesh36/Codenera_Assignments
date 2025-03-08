/*Q2.Write a Java program to find highest frequency character in a string.
*/
package NOV16.StringQues;

import java.util.Scanner;

public class HighestFrequencyCharacter {
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
        System.out.print("Highest frequent character is: "+most);
    }
}

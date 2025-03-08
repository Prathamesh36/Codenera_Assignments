/*4. Implement a Java method to count the occurrences of a specific character in a given String.*/
package Test11;

import java.util.Scanner;

public class FindOccurrenceOfCharInString {

    public void Occurrence(String s){
        char []ch = s.toCharArray();
        int c=1;
        for (int i = 0; i < ch.length; i++) {
            c=1;
            for (int j = i+1; j < ch.length ; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(c>0 && ch[i]!=' '){
                System.out.println(ch[i]+" (Occurrence is: "+c+")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        FindOccurrenceOfCharInString ob = new FindOccurrenceOfCharInString();
        ob.Occurrence(s);
    }
}
/****************************OUTPUT***********************************
 Enter your String: Statements
 S (Occurrence is: 1)
 t (Occurrence is: 3)
 a (Occurrence is: 1)
 e (Occurrence is: 2)
 m (Occurrence is: 1)
 n (Occurrence is: 1)
 s (Occurrence is: 1)
 *********************************************************************/
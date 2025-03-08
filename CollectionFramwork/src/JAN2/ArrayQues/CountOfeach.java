/*Q4. Find the count of each
    String s="Hey, This is String."
    Output: alphabet: 15
            comma: 1
            whitespace: 3
            dot: 1
*/
package JAN2.ArrayQues;

import java.util.Scanner;

public class CountOfeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int alphabet=0;
        int comma=0;
        int whiteSpace=0;
        int dot=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=128){
                alphabet++;
            }
            else if(s.charAt(i)==44){
                comma++;
            }
            else if(s.charAt(i)==32){
                whiteSpace++;
            }
            else if(s.charAt(i)==46){
                dot++;
            }
        }
        System.out.println("OUTPUT: ");
        System.out.println("alphabet: "+alphabet);
        System.out.println("comma: "+comma);
        System.out.println("whitespace: "+whiteSpace);
        System.out.println("dot: "+dot);
    }
}

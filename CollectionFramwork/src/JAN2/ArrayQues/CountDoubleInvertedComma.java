/*Q5. String s="""Hello world"""
    output: double_inverted_comma_count=4*/
package JAN2.ArrayQues;

import java.util.Scanner;

public class CountDoubleInvertedComma {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();*/
        String s = " \"\"Hello world\"\" ";
       // System.out.print("String: "+s);
        int comma=0;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)==34){
               comma++;
           }
        }
        System.out.println();
        System.out.println("OUTPUT: ");
        System.out.println("double_inverted_comma_count= "+comma);
    }
}

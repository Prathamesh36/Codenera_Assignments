/*Write a program that takes in a string and returns the length
of the shortest substring that contains all vowels*/
package NOV21.PracticeSession;

import java.util.Scanner;

public class lengthofShortestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] b= s.split(" ");
        int min=999;
        String c="";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if(b[i].length()<min){
                min=b[i].length();
                c=b[i];
            }
        }
        char[] k=c.toCharArray();
        for (int i = 0; i < k.length; i++) {
            if(k[i]=='a'||k[i]=='e'||k[i]=='i'||k[i]=='o'||k[i]=='u'){
                sb.append(k[i]);
            }
        }
        System.out.println("Length of shortest String: "+min);
        System.out.print("Vowels of shortest String: "+sb);
    }
}

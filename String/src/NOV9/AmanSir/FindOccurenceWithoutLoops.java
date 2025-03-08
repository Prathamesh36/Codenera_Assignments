package NOV9.AmanSir;

import java.util.Scanner;

public class FindOccurenceWithoutLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        int len=str.length();
        String ch =sc.next();
        String str1 =str.replace(ch,"");
        int le2=str1.length();
        System.out.print("The Occurence of "+ch+" is "+(len-le2));


    }
}

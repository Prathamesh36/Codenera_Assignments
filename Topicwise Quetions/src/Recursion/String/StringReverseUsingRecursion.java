package Recursion.String;

import java.util.Scanner;

public class StringReverseUsingRecursion {

    public static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String reverseStr = reverse(s,idx+1);
        char currentChar = s.charAt(idx);
        return reverseStr + currentChar;
    }

    public static String reverse2(String s){
        if(s.length()==0){
            return "";
        }
        String reverseStr2 =reverse2(s.substring(1));
        char currentChar = s.charAt(0);
        return reverseStr2+currentChar;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx=0;
        System.out.println(reverse(s,idx));
        System.out.println(reverse2(s));
    }
}

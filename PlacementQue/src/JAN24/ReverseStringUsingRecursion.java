package JAN24;

import java.util.Scanner;

public class ReverseStringUsingRecursion {

    public static String reverse(String s){
        if(s.length()==0) return "";
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Reverse String: "+reverse(s));
    }
}

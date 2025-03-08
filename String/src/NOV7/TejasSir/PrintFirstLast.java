package NOV7.TejasSir;

import java.util.Scanner;

public class PrintFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print("First and Last character of String: ");
        System.out.print(s.charAt(0)+" "+s.charAt(s.length()-1));
    }
}

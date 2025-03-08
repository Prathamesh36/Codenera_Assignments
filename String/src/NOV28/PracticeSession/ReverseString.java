package NOV28.PracticeSession;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        System.out.print("Reverse String: "+sb.reverse());
    }
}

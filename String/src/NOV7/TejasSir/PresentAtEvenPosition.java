package NOV7.TejasSir;

import java.util.Scanner;

public class PresentAtEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("Character at even position: ");
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i) + " ");
            }
        }
        System.out.print("Character at odd position: ");

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}

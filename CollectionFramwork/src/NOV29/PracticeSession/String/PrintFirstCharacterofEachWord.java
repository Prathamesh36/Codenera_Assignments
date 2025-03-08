package NOV29.PracticeSession.String;

import java.util.Scanner;

public class PrintFirstCharacterofEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            String b = a[i];
            System.out.print(b.charAt(0)+" ");
        }
    }
}

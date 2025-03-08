package NOV28.PracticeSession;

import java.util.Scanner;

public class CheckTwoStringContainsSameData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter your String: ");
        String f = sc.nextLine();
        if(s.equals(f)) System.out.println("True");
        else System.out.println("False");
    }
}

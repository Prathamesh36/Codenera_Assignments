package NOV20;

import java.util.Scanner;

public class convertInLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Lower Case: "+s.toLowerCase());
    }
}

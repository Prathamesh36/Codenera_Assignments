package NOV20;

import java.util.Scanner;

public class ConcatenateAndReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String 1: ");
        String s = sc.nextLine();
        System.out.print("Enter your String 2: ");
        String s1 = sc.nextLine();
        StringBuilder a = new StringBuilder(s.concat(s1));
        System.out.print("OUTPUT: "+a.reverse());

    }
}

package NOV20;

import java.util.Scanner;

public class ConcatenateTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String 1: ");
        String s = sc.nextLine();
        System.out.print("Enter your String 2: ");
        String s1 = sc.nextLine();
        System.out.print("OUTPUT: "+s.concat(s1));
    }
}

package NOV28.PracticeSession;

import java.util.Scanner;

public class IndexOfLastStringWithinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.println("Index of Last String: "+s.indexOf(a[a.length-1]));
    }
}

package NOV22.PracticeSession;

import java.util.Scanner;

public class ReverseWordNotLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a= s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length-1; i>=0; i--) {
            sb.append(a[i]+" ");
        }
        System.out.print("OUTPUT: "+sb);

    }
}

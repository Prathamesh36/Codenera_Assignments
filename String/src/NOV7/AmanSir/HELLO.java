package NOV7.AmanSir;

import java.util.Scanner;

public class HELLO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        byte[] a = s.getBytes();
        for (int i = 0; i < a.length; i++) {
            System.out.print((char)(a[i]+4));

        }
    }
}

package NOV8.TejasSir;

import java.util.Scanner;

public class PrintFirstCharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.print("OUTPUT: ");
        for (int i = 0; i < str.length; i++) {
            String str1 = str[i];
            char ch = str1.charAt(0);
            System.out.print(ch);
        }
    }
}

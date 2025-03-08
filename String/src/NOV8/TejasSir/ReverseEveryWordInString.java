package NOV8.TejasSir;

import java.util.Scanner;

public class ReverseEveryWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.print("Reverse String: ");
        for (int i = str.length-1; i >=0 ; i--) {
            String a =str[i];
            char[]b = a.toCharArray();
            for (int j = b.length-1; j >=0 ; j--) {
                System.out.print(b[j]);
            }
            System.out.print(" ");
        }
    }
}

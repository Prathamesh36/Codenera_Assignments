package NOV18;

import java.util.Scanner;

public class LastMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.nextLine();
        System.out.print("Enter Your String: ");
        String b = sc.nextLine();
        int i = a.lastIndexOf(b);
        System.out.print(i+1);
    }
}

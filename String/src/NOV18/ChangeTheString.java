package NOV18;

import java.util.Scanner;

public class ChangeTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.nextLine();
        String b;
        if(Character.isUpperCase(a.charAt(0))) b=a.toUpperCase();
        else b=a.toLowerCase();
        System.out.print("OUTPUT: "+b);

    }
}

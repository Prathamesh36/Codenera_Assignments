package NOV20;

import java.util.Scanner;

public class ConvertInUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Upper Case: "+s.toUpperCase());
    }
}

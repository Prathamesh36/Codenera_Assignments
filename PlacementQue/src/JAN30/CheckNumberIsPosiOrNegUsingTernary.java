package JAN30;

import java.util.Scanner;

public class CheckNumberIsPosiOrNegUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int s = sc.nextInt();
        System.out.println((s>0?"positive":"negative"));
    }
}

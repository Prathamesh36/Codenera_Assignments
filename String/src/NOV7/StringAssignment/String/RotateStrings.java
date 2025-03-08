package NOV7.StringAssignment.String;

import java.util.Scanner;

public class RotateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.print("Enter no. of rotation you want: ");
        int n = sc.nextInt();
        for (int j = 1; j <=n; j++) {
            String temp = str[str.length - 1];
            for (int i = str.length - 1; i > 0; i--) {
                str[i] = str[i - 1];
            }
            str[0] = temp;
        }
        System.out.println("Clock-Wise Rotation: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

    }
}

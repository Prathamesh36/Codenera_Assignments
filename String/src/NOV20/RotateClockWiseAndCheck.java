package NOV20;

import java.util.Scanner;

public class RotateClockWiseAndCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("Enter your String: ");
        String s1 = sc.next();
        StringBuilder f = new StringBuilder();
        char[] str = s.toCharArray();
        int n =2;
        for (int j = 1; j <=n; j++) {
            char temp = str[str.length-1];
            for (int i = str.length - 1; i > 0; i--) {
                str[i] = str[i - 1];
            }
            str[0] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            f.append(str[i]);
        }

        if(f.toString().equals(s1)){
            System.out.print("OUTPUT: YES");
        }
        else{
            System.out.print("OUTPUT: NO");
        }
    }
}

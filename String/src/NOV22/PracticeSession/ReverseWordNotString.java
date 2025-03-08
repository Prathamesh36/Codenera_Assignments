package NOV22.PracticeSession;

import java.util.Scanner;

public class ReverseWordNotString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            char a[]=str[i].toCharArray();
            for (int j = a.length-1; j >=0; j--) {
                sb.append(a[j]);
            }
            sb.append(" ");
        }
        System.out.print("OUTPUT: "+sb);
    }
}

package NOV22.PracticeSession;

import java.util.Scanner;

public class RepelaceStringConsonantsWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter Your Character: ");
        char a = sc.next().charAt(0);
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                sb.append(ch[i]);

            } else {
                sb.append(a);
            }
        }
        System.out.print("OUTPUT: "+sb);
    }
}

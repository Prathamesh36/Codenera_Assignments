package NOV29.PracticeSession.String;

import java.util.Scanner;

public class PrintWordThatContainsEInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            String g = a[i];
            char[] b=g.toCharArray();

            for (int j = 0; j < b.length; j++) {
                if(b[j]=='e' || b[j]=='E'){
                    System.out.print(g+" ");
                    break;
                }

            }
        }
    }
}

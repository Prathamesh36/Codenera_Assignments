package NOV29.PracticeSession.String;

import java.util.Scanner;

public class DeleteWordFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("Enter String to delete: ");
        String s1 = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(s1)){
                continue;
            }
            sb.append(a[i]+" ");
        }
        System.out.print("OUTPUT: "+sb);
    }
}

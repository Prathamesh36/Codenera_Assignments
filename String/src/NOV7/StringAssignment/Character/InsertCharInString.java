package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class InsertCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("Enter Character do you want to insert: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter Position where you want to insert: ");
        int posi = sc.nextInt();
        byte[] a = s.getBytes();
        byte[] b = new byte[a.length+1];
        String n="";
        for (int i = 0; i < posi-1; i++) {
            b[i]=a[i];
        }
        b[posi-1]=(byte) ch;
        for (int i = posi; i <b.length; i++) {
            b[i]=a[i-1];
        }
        System.out.print("String after insertion: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
    }
}
/************************OUTPUT************************
 Enter your String: Coenera
 Enter Character do you want to insert: d
 Enter Position where you want to insert: 3
 String after insertion: Codenera
 ******************************************************/

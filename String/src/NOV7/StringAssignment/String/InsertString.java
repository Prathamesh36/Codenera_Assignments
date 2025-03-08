package NOV7.StringAssignment.String;

import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("Enter String do you want to insert: ");
        String str = sc.next();
        System.out.print("Enter position where you want to insert: ");
        int posi = sc.nextInt();
        String b[] = new String[a.length+1];
        for (int i = 0; i < posi-1; i++) {
            b[i]=a[i];
        }
        b[posi-1]=str;
        for (int i = posi; i <b.length; i++) {
            b[i]=a[i-1];
        }
        System.out.print("String after insertion: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
/************************OUTPUT************************
 Enter your String: I am living in city
 Enter String do you want to insert: pune
 Enter position where you want to insert: 5
 String after insertion: I am living in pune city
 ******************************************************/
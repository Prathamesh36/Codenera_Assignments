package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class RotateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("Enter no. of rotation you want: ");
        int n = sc.nextInt();
        byte[] a = s.getBytes();

        for (int j = 1; j <=n; j++) {
            byte temp=a[0];
            for (int i = 1; i <a.length; i++) {
                a[i-1]=a[i];
            }
            a[a.length-1]=temp;
        }
        System.out.print("String after anti-clockwise rotations: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print((char) a[i]);
        }

    }
}
/**************************OUTPUT****************************
 Enter your String: ABCDEFG
 Enter no. of rotation you want: 3
 String after anti-clockwise rotations: DEFGABC
 ***********************************************************/

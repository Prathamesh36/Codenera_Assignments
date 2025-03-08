package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class DeletionCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("Enter Character do you want to delete: ");
        char ch = sc.next().charAt(0);
        byte[] a = s.getBytes();
        String n="";
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=ch){
                n=n+s.charAt(i);
            }
        }
        System.out.print("String After deletion: ");
        for (int i = 0; i < n.length(); i++) {
            System.out.print(n.charAt(i));
        }
    }
}
/**************************OUTPUT****************************
 Enter your String: CODENERA
 Enter Character do you want to delete: E
 String After deletion: CODNRA
 ***********************************************************/
package NOV7.TejasSir;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();

        System.out.print("Reverse String is: ");
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.print(s.charAt(i)+" ");
                c++;
            }
        }
        System.out.println();
        System.out.print("Count is: "+c);
    }
}

package NOV10;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String s = sb.toString();
        System.out.print("Enter word to replace at even position: ");
        String h = sc.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                a[i]=h;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

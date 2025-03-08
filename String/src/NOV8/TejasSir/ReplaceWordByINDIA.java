package NOV8.TejasSir;

import java.util.Scanner;

public class ReplaceWordByINDIA {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                a[i]="INDIA";
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}

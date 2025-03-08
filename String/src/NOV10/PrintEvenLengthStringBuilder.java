package NOV10;

import java.util.Scanner;

public class PrintEvenLengthStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String a =sb.toString();
        String[] b = a.split(" ");
        System.out.println("OUTPUT: ");
        for (int i = 0; i < b.length; i++) {
            if(b[i].length()%2==0){
                System.out.println(b[i]);
            }
        }

    }
}

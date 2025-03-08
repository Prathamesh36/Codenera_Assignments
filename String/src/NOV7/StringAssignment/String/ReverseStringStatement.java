package NOV7.StringAssignment.String;

import java.util.Scanner;

public class ReverseStringStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i]+" ");
        }
    }
}

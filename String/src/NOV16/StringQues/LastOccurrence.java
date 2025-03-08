package NOV16.StringQues;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        char[] b = s.toCharArray();
        for (int i = b.length-1; i >=0 ; i--) {
            if(b[i]==ch){
                System.out.print("Last occurrence is at "+i+" index");
                break;

            }
        }
    }
}

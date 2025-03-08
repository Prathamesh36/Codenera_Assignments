package JAN24;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {

    static int rev =0;
    public static int reverseNum(int a){
        if(a==0) return rev;
        if(a>0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            reverseNum(a / 10);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        System.out.println("Reverse number: "+reverseNum(s));
        //reverseNum(s);
    }
}

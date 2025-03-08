package JAN24;

import java.util.Scanner;

public class ImplementCountDownMethodUsingRecursion {

    public static void countDown(int a){
        System.out.print(a+" ");
        if(a==0) return;
        countDown(a-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("countDown: ");
        countDown(n);
    }
}

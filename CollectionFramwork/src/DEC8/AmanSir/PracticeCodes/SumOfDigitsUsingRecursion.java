package DEC8.AmanSir.PracticeCodes;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {

    static int sum(int a){
        if(a==0)return a;
        return  (a%10)+sum(a/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        System.out.println("Sum of Digits: "+sum(a));
    }
}

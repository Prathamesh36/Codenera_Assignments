package FEB10;

import java.util.Scanner;

public class findFactorialOf_n_Numbers {

    public static int fact(int a){
        if(a==1) return 1;
        return a*fact(a-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        System.out.println("Factorial is: "+fact(n));
    }
}

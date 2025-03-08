package DEC8.AmanSir.PracticeCodes;

import java.util.Scanner;

public class FactorialOfnumberUsingRecursion {

    static int fact(int a){
        if(a==1) return 1;
        return a*fact(a-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: "+fact(n));
    }
}

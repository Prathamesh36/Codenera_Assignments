package JAN31.Advance;

import java.util.Scanner;

public class CheckNumberIsPrimeOrComposite {

    public static boolean isprime(int n ){
        int c=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                c++;
            }
        }
        if(c==0) return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int n =sc.nextInt();
        if(isprime(n)) System.out.println("Prime Number");
        else System.out.println("Composite Number ");

    }
}

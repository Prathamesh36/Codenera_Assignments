package Jun25;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        int count=0;
        for (int i = 2; i < num; i++) {
            if(num%i==0) count++;
        }
        if(count==0) System.out.print("Given Number is Prime Number");
        else System.out.println("Given number is not Prime Number");
    }
}


//2 3 4 5 6 7
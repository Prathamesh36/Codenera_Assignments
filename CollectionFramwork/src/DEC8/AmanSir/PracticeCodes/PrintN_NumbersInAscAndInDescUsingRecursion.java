package DEC8.AmanSir.PracticeCodes;

import java.util.Scanner;

public class PrintN_NumbersInAscAndInDescUsingRecursion {

    static void printAscending(int a){
        if(a==0){
            System.out.print(a+" ");
            return;
        }
        printAscending(a-1);
        System.out.print(a+" ");

    }
    static void printDescending(int a){
        if(a==0){
            System.out.print(a);
            return;
        }
        System.out.print(a+" ");
        printDescending(a-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("Ascending Order: ");
        printAscending(n);
        System.out.println();
        System.out.println("Descending Order: ");
        printDescending(n);

    }
}

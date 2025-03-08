package DEC8.AmanSir.PracticeCodes;

import java.util.Scanner;

public class FindNthPowerOfNumberUsingRecursion {

    static int power(int a,int p){
        if(p==1) return a;
        return a*power(a,p-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        System.out.println(p+" power of "+n+" is: "+power(n,p));
    }
}

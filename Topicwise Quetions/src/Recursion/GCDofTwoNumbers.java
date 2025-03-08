package Recursion;

import java.util.Scanner;

public class GCDofTwoNumbers {

    static  int iGCD(int x, int y){      //if x=12 y=15
        while (x%y!=0) {
            int rem = x % y;            // 12%15 =12     //15%12=3      //12%3!=0  false
            x = y;                      //x=15           //x=12
            y = rem;                    //y=12           //y=3(return)
        }
        return y;
    }
    static  int GCD(int x, int y){      //Euclids  Algorithm
       if(y==0) return x;       // any no. modulus 0 is always that no.
       return GCD(y,x%y);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("GCD using iteration: ");
        System.out.println(iGCD(x,y));
        System.out.println("GCD using recursion: ");
        System.out.println(GCD(x,y));

    }
}

/*2.Create a method in Java that takes a number as input and prints whether it is even or odd.*/
package Test8;

import java.util.Scanner;
public class OddOrEven {

    public String OddEven(int n){
        if(n%2==1) return "odd";
        return "even";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        OddOrEven ob = new OddOrEven();
        System.out.print("Output: "+ob.OddEven(n));
    }
}
/***********************OUTPUT*************************
 Enter your array size: 54
 Output: even
 *****************************************************/
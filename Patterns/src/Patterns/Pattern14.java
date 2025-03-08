package Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        int n = str.length();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j || j == n-i+1){
                    System.out.print(str.charAt(i-1)+" ");
                }
                else{
                    System.out.print("  ");
                }

            }
//            for (int  j = i;  j<= n;  j++) {
//                if(j==n-i+1){
//                    System.out.print(str.charAt(i-1)+" ");
//                }
//                System.out.print("  ");
//            }
            System.out.println();
        }
    }
}

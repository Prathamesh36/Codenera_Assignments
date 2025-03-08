/*
Q3
     E
    D E
   C D E
  B C D E
 A B C D E
 */
package Patterns;


import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int k=65+n-1;
        for (int i = 1; i <=n; i++) {
            int r = k--;
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                int u = r++;
                System.out.print((char) u+ " ");
            }
            System.out.println();
        }
    }
}


//public class Pattern3 {
//    public static void main(String[] args) {
//        int n=5;
//        int k=69;
//        for(int i=1;i<=n;i++){
//            int u=k--;
//            for(int j=i;j<=n;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((char)u+" ");
//                u++;
//            }
//
//            System.out.println();
//        }
//    }
//}

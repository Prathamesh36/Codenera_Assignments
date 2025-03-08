/* Q2
    A
   B B
  C C C
 D D D D
E E E E E
*/
package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int k=65;
        for (int i = 1; i <=n ; i++) {
            int u=k++;
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)u + " ");

            }
            System.out.println();
        }

    }
}



//public class Pattern2 {
//    public static void main(String[] args) {
//        int n=5;
//        int k=65;
//        for(int i=1;i<=n;i++){
//            int u=k++;
//            for(int j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((char)u+" ");
//            }
//            System.out.println();
//        }
//    }
//}

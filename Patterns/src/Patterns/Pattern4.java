/*Q5
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n= sc.nextInt();
        int t=n;
        for (int i = 1; i <n ; i++) {
            int k=t--;
            for (int j = i; j <=n ; j++) {
                int u = k--;
                System.out.print(u+ " ");
            }
            System.out.println();
        }

        int e=1;
        for (int i = 1; i <=n ; i++) {
            int d = e++;
            for (int j = 1; j <=i ; j++) {
                System.out.print(d--+" ");
            }
            System.out.println();
        }
    }
}

//public class Pattern4 {
//    public static void main(String[] args) {
//        int n=5;
//        int k=5;
//        for(int i=1;i<n;i++){
//            int u=k--;
//            for(int j=i;j<=n;j++){
//                System.out.print(u--+" ");
//            }
//
//            System.out.println();
//        }
//        k=1;
//        for(int i=1;i<=n;i++){
//            int u=k++;
//            for(int j=1;j<=i;j++){
//                System.out.print(u--+" ");
//            }
//
//            System.out.println();
//        }
//    }
//}

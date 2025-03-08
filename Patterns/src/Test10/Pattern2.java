/*
*Q2.
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
   6 5 4 3 2 1 2 3 4 5 6
 7 6 5 4 3 2 1 2 3 4 5 6 7
 */
package Test10;

public class Pattern2 {
    public static void main(String[] args) {
        int n=7;
        int a=1;
        int b=1;
        for(int i=1;i<=n;i++){
            int k=a;
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(k+" ");
                k--;
            }
            a++;
            int t=b+1;
            for (int j = 1; j <i ; j++) {
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
}
/************************OUTPUT*****************************
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
   6 5 4 3 2 1 2 3 4 5 6
 7 6 5 4 3 2 1 2 3 4 5 6 7
 ************************************************************/
/*
Q9
    *
   **
  * *
 *  *
*   *
 *  *
  * *
   **
    *s
*/
package Patterns;

public class Pattern9 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if ( i==j || j==1){ //i==n || i==1 || j==1||j==n
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                if (i == j || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

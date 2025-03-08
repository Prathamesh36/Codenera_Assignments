/*12.
     E
    D E
   C D E
  B C D E
 A B C D E
 */
package Test8;

public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int k=69;
        for(int i=1;i<=n;i++){
            int u=k--;
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)u+" ");
                u++;
            }

            System.out.println();
        }
    }
}
/***********************OUTPUT*************************
     E
    D E
   C D E
  B C D E
 A B C D E
 *****************************************************/
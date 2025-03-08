/*
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
*/
package OCT23.TejasSir;

public class Pattern2 {
    public static void main(String[] args) {
        int n=9;
        int k=65;
        for(int i=1,x=1;i<n;i=i+2,x++){
            int t =k;
            for(int j=1;j<x;j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print((char)t);
                t++;
            }
            System.out.println();
        }
        for(int i=1,x=1;i<=n;i=i+2,x++){
            int t =k;
            for(int j=x;j<=n/2;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print((char)t);
                t++;
            }
            System.out.println();
        }
    }
}

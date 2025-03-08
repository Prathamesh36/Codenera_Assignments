/*Q4
A
A B
A B C
A B C D
A B C D E
A B C D
A B C
A B
A
*/
package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        int k=65;
        for(int i=1;i<n;i++){
            int u=k;
            for(int j=1;j<=i;j++){
                System.out.print((char) u+" ");
                u++;
            }

            System.out.println();
        }

        for(int i=1;i<=n;i++){
            int u=k;
            for(int j=i;j<=n;j++){
                System.out.print((char)u+" ");
                u++;
            }

            System.out.println();
        }


    }
}

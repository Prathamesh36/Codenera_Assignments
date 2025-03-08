/*Q9.
    1
   *2*
  *345*
 *45678*
*567890123*
*/
package Test0;
public class Pattern4 {
    public static void main(String[] args) {
        int n=9;
        int k=1;
        for(int i=1,x=1;i<=n;i=i+2,x++){
            for(int j=x;j<=n/2;j++) {
                System.out.print(" ");
            }
            int t= k;
            int u=0;
            for(int j=1;j<=i;j++) {
                if (i!=1 && j==1 || i!=1 && i==j) {
                    System.out.print("*");
                    t++;
                }
                else{
                    System.out.print(t);
                    t++;
                }
                if(t==10){
                    t=0;
                }
            }
            if(i!=1) {
                k++;
            }
            System.out.println();
        }
    }
}


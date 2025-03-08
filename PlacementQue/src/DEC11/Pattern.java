/*   *
    *2
   *34
  *456
 *5678
    */
package DEC11;

public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int k=0;
        for (int i = 1; i <=n; i++) {
            k=i;
          /*  for(int j=i;j<n;j++){
                System.out.print(" ");
            }*/
            for (int j = i; j <=n; j++) {
                if(!(j==n)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }

            for (int j = 2; j <=i; j++) {
                System.out.print(k);
                k++;
            }


            System.out.println();
        }
    }
}

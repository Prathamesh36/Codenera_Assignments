/*Q1.
a
B c
D e F
g H i J
k L m N o
*/
package Test10;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        int g=97;
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)g+" ");
                if(k%2!=0){
                    g-=32;
                }
                else{
                    g+=32;
                }
                k++;
                g++;
            }
            System.out.println();
        }
    }
}
/************************OUTPUT 1*****************************
 a
 B c
 D e F
 g H i J
 k L m N o
 ************************************************************/

/*
1*2*3*4
5*6*7*8
9*10*11*12
13*14*15*16
*/

package OCT23.TejasSir;

public class Pattern1 {
    public static void main(String[] args) {
        int n=4;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==n){
                    System.out.print(k);
                    k++;
                }
                else{
                    System.out.print(k+"*");
                    k++;
                }

            }
            System.out.println();
        }
    }
}

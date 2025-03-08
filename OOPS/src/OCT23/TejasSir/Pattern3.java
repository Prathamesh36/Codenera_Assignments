/*
6*6*6*6
5*5*5
4*4
3
3
4*4
5*5*5
6*6*6*6
*/
package OCT23.TejasSir;

public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        int k=6;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(j==n){
                    System.out.print(k);
                }
                else{
                    System.out.print(k+"*");
                }
            }
            k--;
            System.out.println();
        }
        ++k;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print(k);
                }
                else{
                    System.out.print(k+"*");
                }
            }
            k++;
            System.out.println();
        }
    }
}

/*Q5.
	       2
           43
           765
           1110198
           1110198
           765
           43
           2*/
package Test0;

public class Pattern1 {
    public static void main(String[] args) {
        int n=4;
        int h=2;
        int g=2;
        for(int i=1;i<=n;i++){
            int t=h;
            for(int j=1;j<=i;j++){
                System.out.print(t);
                t--;
            }
            h=h+g;
            g++;
            System.out.println();
        }
        int l=11;
        int u=4;
        for(int i=1;i<=n;i++){
            int t=l;
            for(int j=i;j<=n;j++){
                System.out.print(t);
                t--;
            }
            l=l-u;
            u--;
            System.out.println();
        }

    }
}
/************************OUTPUT***************************
 2
 43
 765
 111098
 111098
 765
 43
 2
 **********************************************************/
/*Q7.

12345
1***5
1*3*5
1***5
12345*/
package Test0;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print(j);
                }
                else if(i==3 && j ==3){
                    System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/************************OUTPUT***************************
 12345
 1***5
 1*3*5
 1***5
 12345
 **********************************************************/

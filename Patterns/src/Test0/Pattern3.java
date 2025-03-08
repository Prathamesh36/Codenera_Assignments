/*
    1
   A2B
  C3D4E
 F5G6H7I
J8K9L0M1N
*/
package Test0;

public class Pattern3 {
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
/**************************OUTPUT****************************
 Enter Array size: 9
 Enter Array element: 3 3 4 2 4 4 2 4 4
 Majority Element is: 4
 **********************************************************/

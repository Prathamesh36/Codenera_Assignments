/*12345
1***5
1*3*5
1***5
12345*/
package DEC11;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n; j++) {
                if(i==n || j==1 || j==n ||i==1){
                    System.out.print(i);
                }
                else if(i==3&& j==3){
                    System.out.print(i);
                }
                else{
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }
}

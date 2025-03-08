package DEC11;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        int k=5;
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                if(i==j){
                    System.out.print(k);
                }
                else System.out.print("*");
            }
            k--;



            System.out.println();
        }
    }
}

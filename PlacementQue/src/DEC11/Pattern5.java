package DEC11;

public class Pattern5 {

    static boolean isPrime(int a){
        int c=0;
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                c++;
            }
        }
        if(c==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n=11;
        int u=1;
        int z =65;
        int k=1;
        for (int i = 1, t=1; i <=n; i=i+2,t++) {
            k=u;
            if(isPrime(i)) {
                for (int j = t; j <= n / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {

                    if (j == 1 && i != 1 || j == i && i != 1) {
                        System.out.print("*");
                        continue;
                    } else {
                        System.out.print(k);
                    }
                    k++;

                    if (k == 10) {
                        k = 0;
                    }
                }
                u++;

                System.out.println();
            }
        }
    }
}

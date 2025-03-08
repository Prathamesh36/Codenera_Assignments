package DEC11;

public class Pattern4 {
    public static void main(String[] args) {
        int n=10;
        int k=2;
        int z =65;
        for (int i = 1, t=1; i <=n; i=i+2,t++) {
            for (int j = t; j <=n/2; j++) {
                    System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if(i==1 && j==1){
                    System.out.print("1");
                    continue;
                }
                if(((i+j)%2)==1){
                    System.out.print(k);
                    k++;
                }
                else{
                    System.out.print((char)z);
                    z++;
                }
                if(k==10){
                    k=0;
                }
            }
            System.out.println();
        }
    }
}

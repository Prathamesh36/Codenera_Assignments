package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n =3;
        for(int i=1;i<=n;i++){
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for(int j=1;j<i*2;j++){
                if(i==j){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}

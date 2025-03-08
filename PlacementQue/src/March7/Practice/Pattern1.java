package March7.Practice;

public class Pattern1 {
    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
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

package Patterns;

public class HollowDiamondUsingThread extends Thread{
    public static void main(String[] args) throws InterruptedException {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            Thread.sleep(500);
            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <n; j++) {
                if(j==i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {
                if(j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            Thread.sleep(500);
            System.out.println();
        }

    }
}

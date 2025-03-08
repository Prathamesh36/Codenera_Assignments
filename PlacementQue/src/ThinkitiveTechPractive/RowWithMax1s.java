package ThinkitiveTechPractive;

import java.util.Scanner;

public class RowWithMax1s {

    public static int maxOnesInRow(int[][] a){
        int max =0;
        int maxInRow=-1;
        for (int i = 0; i < a.length; i++) {
            int rmax=0;
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==1){
                    rmax++;
                }
            }
            if(rmax>max){
                max=rmax;
                maxInRow=i;
            }
        }
        return maxInRow;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter matrix row number: ");
        int x=sc.nextInt();
        System.out.print("Enter matrix column number: ");
        int y=sc.nextInt();
        int a[][]= new int[x][y];
        System.out.println("Enter your matrix element: ");
        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Row with max 1's is: "+maxOnesInRow(a));
    }
}

/*Q3. How to find the saddle point of a matrix in java?(minimum in rows and maximum in columns). */
package Test10;

import java.util.Scanner;

public class FindSaddlePointInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix row size: ");
        int r = sc.nextInt();
        System.out.print("Enter Matrix column size: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter Matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        int min = 9999;
        int colIdx=-1;
        int cidx=-1;
        int ridx=-1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]<min){
                    min=mat[i][j];
                    colIdx=j;
                }
            }

            for (int j = 0; j < mat[i].length; j++) {
                if(mat[j][colIdx]>min){
                    ridx=j;
                    cidx=colIdx;
                }
            }
        }
        System.out.print("Saddle point found at ("+ridx+", "+cidx+"): "+mat[ridx][cidx]);

    }
}
/************************OUTPUT*****************************
 Enter Matrix row size: 3
 Enter Matrix column size: 3
 Enter Matrix elements:
 1 2 3
 4 5 6
 7 8 9
 Saddle point found at (2, 0): 7
 ************************************************************/
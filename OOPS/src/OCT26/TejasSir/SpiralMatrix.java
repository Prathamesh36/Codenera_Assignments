/*15.Given a 2D array, print it in spiral form.
   Examples:
   Input:  {{1,    2,   3,   4},
            {5,    6,   7,   8},
            {9,   10,  11,  12},
            {13,  14,  15,  16 }}
   Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
   Explanation: The output is matrix in spiral format.*/
package OCT26.TejasSir;

import java.util.Scanner;

class spiral{
    int a[][];
    spiral(int a[][]){
        this.a=a;
    }
    public void matrixspiral(){
        int top = 0;
        int bottom =a.length-1;
        int left = 0;
        int right = a.length-1;
while(true){
            for (int i = left; i <=right ; i++) {
                System.out.print(a[top][i]+" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right]+" ");
            }
            right--;
            for (int i = right; i >=left ; i--) {
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                System.out.print(a[i][left]+" ");
            }
            left++;
        }

    }
}

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row size: ");
        int r = sc.nextInt();
        System.out.print("Enter matrix column size: ");
        int c = sc.nextInt();
        int a[][] =  new int[r][c];
        System.out.println("Enter Matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        spiral ob= new spiral(a);
        ob.matrixspiral();
    }
}

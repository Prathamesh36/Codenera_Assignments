/*
Search in a row wise and column wise sorted matrix

Input: mat[4][4] = { {10, 20, 30, 40},
                     {15, 25, 35, 45},
                     {27, 29, 37, 48},
                     {32, 33, 39, 50}}

                 x = 29
Output: Found at (2, 1)
*/
package OCT16.TejasSir;

import java.util.Scanner;

public class findNumberInMatrix {
    public void findnumber(){
        Scanner sc = new Scanner(System.in);
        int a[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        System.out.print("Enter element to find in matrix: ");
        int f = sc.nextInt();
        System.out.print("Element found at : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==f){
                    System.out.print("("+i+" "+j+")");
                }
            }
        }
    }




    public static void main(String[] args) {
        findNumberInMatrix ob = new findNumberInMatrix();
        ob.findnumber();
    }
}

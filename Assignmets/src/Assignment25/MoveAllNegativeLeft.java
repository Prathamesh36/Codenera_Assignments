/*8. Move all negative numbers to beginning and positive to end with constant extra space
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5*/
package Assignment25;

import java.util.Scanner;

public class MoveAllNegativeLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i] > 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Array after moving negatives to one side: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
/***************************OUTPUT*******************************
 Enter Array size: 9
 Enter Array element: -12 11 -13 -5 6 -7 5 -3 -6
 Array after moving negatives to one side: -12 -13 -5 -7 -3 -6 5 6 11
 ***************************************************************/
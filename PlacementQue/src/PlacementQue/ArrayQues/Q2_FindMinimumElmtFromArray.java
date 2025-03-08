/*Write a program to find the minimum element in an array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q2_FindMinimumElmtFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int min=9999;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum Element: "+min);
    }
}
/**************************OUTPUT*****************************

 Enter Array size: 5
 Enter Array element: 8 1 3 7 6
 Minimum Element: 1
 ************************************************************/
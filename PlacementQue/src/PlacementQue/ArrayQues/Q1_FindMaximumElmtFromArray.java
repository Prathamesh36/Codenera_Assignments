/*Write a program to find the maximum element in an array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q1_FindMaximumElmtFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum Element: "+max);
    }
}
/**************************OUTPUT*****************************
 
 Enter Array size: 5
 Enter Array element: 8 4 3 1 9
 Maximum Element: 9
 ************************************************************/
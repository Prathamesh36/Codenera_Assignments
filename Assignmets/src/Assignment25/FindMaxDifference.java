/*5. Write a Java program to find maximum difference between two elements in a given array of integers such that smaller element appears before larger element.

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10*/
package Assignment25;

import java.util.Scanner;

public class FindMaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max =0;
        int min =999;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("Maximum Difference is: "+(max-min));
    }
}
/***************************OUTPUT*******************************
 Enter Array size: 9
 Enter Array element: 2 3 1 7 9 5 11 3 5
 Maximum Difference is: 10
 ***************************************************************/
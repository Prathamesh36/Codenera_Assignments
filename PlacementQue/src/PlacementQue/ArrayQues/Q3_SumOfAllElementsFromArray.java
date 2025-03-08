/*Write a program to calculate the sum of all elements in an array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q3_SumOfAllElementsFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.print("Sum of the elements is: "+sum);
    }
}
/**************************OUTPUT*****************************

 Enter your array size: 5
 Enter your array element: 8 4 3 1 9
 Sum of the elements is: 25
 ************************************************************/
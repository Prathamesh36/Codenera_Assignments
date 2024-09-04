/*39.	Write a program to calculate the sum of all elements in an array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class SumOfAllElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.print("Sum of all Elements: "+sum);
    }
}
/************************OUTPUT****************************
 Enter Array size: 5
 Enter Array element:  4 8 3 1 9
 Sum of all Elements: 25
 *********************************************************/
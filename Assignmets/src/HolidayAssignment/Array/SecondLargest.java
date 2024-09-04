/*43.	Write a program to find the second largest element in an array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class SecondLargest {
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
        int smax=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }
        }
        System.out.print("Second max element is: ");
        System.out.print(smax);
    }
}
/************************OUTPUT****************************
 Enter Array size: 6
 Enter Array element:  8 4 2 1 9 3
 Second max element is: 8
 *********************************************************/
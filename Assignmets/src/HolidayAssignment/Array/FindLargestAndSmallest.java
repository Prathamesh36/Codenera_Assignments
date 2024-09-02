/*51.	Write a program to find the largest and smallest elements in an array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        int min=9;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Smallest Element: "+min);
        System.out.print("Largest Element: "+max);


    }
}
/************************OUTPUT****************************
 Enter Array size: 7
 Enter Array element:  8 4 9 1 3 7 2
 Smallest Element: 1
 Largest Element: 9
 *********************************************************/
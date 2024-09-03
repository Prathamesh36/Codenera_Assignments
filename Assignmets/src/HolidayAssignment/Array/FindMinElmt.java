/*38.	Write a program to find the minimum element in an array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class FindMinElmt {
    public int Minn(int a[]){
        int min=9;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        FindMinElmt ob= new FindMinElmt();
        System.out.println("Min element is: "+ob.Minn(a));
    }
}
/************************OUTPUT****************************
 Enter Array size: 5
 Enter Array element: 2 4 8 3 7
 Min element is: 2
 *********************************************************/

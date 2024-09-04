/*44.	Write a program to remove duplicates from an array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int c=1;
        System.out.print("New Array: ");
        for (int i = 0; i < a.length; i++) {
            c=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
/************************OUTPUT****************************
 Enter Array size: 8
 Enter Array element: 4 2 2 6 1 2 4 8
 New Array: 4 2 6 1 8
 *********************************************************/
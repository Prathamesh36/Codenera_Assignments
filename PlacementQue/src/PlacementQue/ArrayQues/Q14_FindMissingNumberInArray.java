/*Write a program to find the missing number in an array of consecutive integers.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q14_FindMissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int sum =0;
        for (int i = a[0]; i <=a[a.length-1] ; i++) {
            sum+=i;
        }
        int total_sum=0;
        for (int i = 0; i<a.length ; i++) {
            total_sum+=a[i];
        }
        int miss=sum-total_sum;
        System.out.print("Missing number is: "+miss);
    }
}
/************************OUTPUT****************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 6
 Missing number is: 5
 *********************************************************/

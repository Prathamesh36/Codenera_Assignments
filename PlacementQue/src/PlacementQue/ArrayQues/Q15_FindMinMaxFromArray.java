/*Write a program to find the largest and smallest elements in an array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q15_FindMinMaxFromArray {

    public static void minmaxx(int a[]){
        int max =0;
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("Largest number is: "+max);
        System.out.print("\nsmallest numbrt is: "+min);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        minmaxx(a);
    }
}
/************************OUTPUT****************************
 Enter Array size: 8
 Enter Array Element: 5 4 2 1 6 4 9 3
 Largest number is: 9
 smallest number is: 1
 *********************************************************/
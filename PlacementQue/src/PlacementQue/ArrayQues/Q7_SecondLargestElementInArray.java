/*Write a program to find the second largest element in an array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q7_SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elemets: ");
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

 Enter your array size: 5
 Enter Array Elements: 6 5 4 9 3
 Second max element is: 6
 *********************************************************/

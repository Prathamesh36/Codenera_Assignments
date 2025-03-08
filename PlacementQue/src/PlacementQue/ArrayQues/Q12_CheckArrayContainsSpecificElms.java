/*Write a program to check if an array contains a specific element.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q12_CheckArrayContainsSpecificElms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elemets: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int e = sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==e){
                count++;
            }
        }
        if(count>0){
            System.out.print("Element found");
        }
        else{
            System.out.print("Element not found");
        }
    }
}
/************************OUTPUT****************************
 Enter your array size: 6
 Enter Array Elements:  4 8 9 1 3 2
 Enter number to search: 3
 Element found
 *********************************************************/

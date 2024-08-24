/*2.Write a Java program to shuffle a given array of integers.
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]*/
package Assignment25;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        Random rn = new Random();
        int j;
        for(int i=0;i<a.length;i++){
            j= rn .nextInt(i+1);
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.print("Shuffled Array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }
}
/***************************OUTPUT*******************************
 Enter Array size: 6
 Enter Array element: 1 2 3 4 5 6
 Shuffled Array: 6 2 4 1 3 5
 ***************************************************************/
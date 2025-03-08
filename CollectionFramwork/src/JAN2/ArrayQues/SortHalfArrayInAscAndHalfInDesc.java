/*
Q2 .Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},
*/
package JAN2.ArrayQues;

import java.util.Scanner;

public class SortHalfArrayInAscAndHalfInDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array 1 size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int mid=(a.length)/2;
        int end=a.length-1;
        while (mid<end){
            int temp = a[mid];
            a[mid]=a[end];
            a[end]=temp;
            mid++;
            end--;
        }
        System.out.print("OUTPUT: ");
        for (int l = 0; l < a.length; l++) {
            System.out.print(a[l]+" ");
        }

    }
}
/*Enter your Array 1 size: 10
Enter Array 1 elements: 9 1 3 5 6 11 22 66 10 19
OUTPUT: 1 3 5 6 9 66 22 19 11 10 */
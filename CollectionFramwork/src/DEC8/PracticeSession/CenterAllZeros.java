/*All zeros should be in middle of array

int[] a={0,1,2,3,4,0,}
output: {1,2,0,0,3,4}*/
package DEC8.PracticeSession;

import java.util.Arrays;
import java.util.Scanner;

public class CenterAllZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0) count++;
        }
       /* for (int i =0; i <a.length ; i++) {
            System.out.print(a[i]);
        }*/

        int start =0;
        for (int i = a.length-count; i <(a.length)-(count/2) ; i++) {
            if(a[i]!=0){
                int temp = a[i];
                a[i]=a[start];
                a[start]=temp;
                start++;
            }
        }
        System.out.print("OUTPUT: ");
        for (int i =0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

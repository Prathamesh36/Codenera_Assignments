/*Q1.
   a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}

  output array=c[]={10,5,20,4,30,3,40,2,50,1}
*/
package JAN2.ArrayQues;

import java.util.Scanner;

public class InsertSecArrayInReverseInFirstArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array 1 size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your Array 2 size: ");
        int n1 = sc.nextInt();
        int[] b = new int[n1];
        System.out.print("Enter Array 2 elements: ");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        int[] c = new int[a.length+b.length];
        int k=0;
        int i=0;
        int j=b.length-1;
        while(k<c.length){
            c[k]=a[i];
            i++;
            k++;
            c[k]=b[j];
            j--;
            k++;
        }
        System.out.print("OUTPUT: ");
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l]+" ");
        }
    }
}

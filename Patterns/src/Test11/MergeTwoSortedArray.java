/*6. Create a Java program to merge two sorted arrays into a single sorted array.*/
package Test11;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your array size: ");
        int n1 = sc.nextInt();
        int[] b= new int[n1];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        int c[] = new int [a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        int k=1;
        int h=0;
        int[] f = new int[c.length];
        for(int i=0;i<c.length;i++){
            k=1;
            for (int j = i+1; j < c.length; j++) {
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(c[i]!=-1){
                f[h]=c[i];
                h++;
            }
        }
        Arrays.sort(f);
        System.out.print("OUTPUT: ");
        for (int i = 0; i < f.length; i++) {
            if(f[i]!=0){
                System.out.print(f[i]+" ");
            }
        }
    }
}
/************************OUTPUT*****************************
 Enter your array size: 5
 Enter your array element: 1 2 3 4 5
 Enter your array size: 5
 Enter your array element: 6 7 8 9 10
 OUTPUT: 1 2 3 4 5 6 7 8 9 10
 ************************************************************/
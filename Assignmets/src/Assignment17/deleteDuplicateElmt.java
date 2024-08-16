/*5. Given a sorted array A[] of size N, delete all the duplicates elements from A[].
Input:
N = 3
Array = {1, 2, 2}
Output: 1 2*/
package Assignment17;

import java.util.Scanner;

public class deleteDuplicateElmt {

    public int[] delete(int c[]){
        int t=0;
        int[] d = new int[c.length];
        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(c[i]!=-1 && k>=1){
                d[t]=c[i];
                t++;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        deleteDuplicateElmt ob = new deleteDuplicateElmt();
        int g[] = ob.delete(a);
        System.out.print("Array after deleting duplicate elements: ");
        for(int i=0;i<g.length;i++){
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }

    }
}
/******************OUTPUT********************
 Enter your array length: 5
 Enter your array element: 1 2 2 3 3
 Array after deleting duplicate elements: 1 2 3
 ********************************************/

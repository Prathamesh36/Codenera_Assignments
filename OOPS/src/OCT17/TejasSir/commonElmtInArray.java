/*Q5.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80

*/
package OCT17.TejasSir;

import java.util.Scanner;

public class commonElmtInArray {

    public void common(int []a,int[] b,int[] c){
        int k=0;
        System.out.print("Duplicate Elements: ");
        for(int i=0;i<a.length;i++){
            k=0;
            for(int j=0;j<b.length;j++){
                for(int z=0;z<c.length;z++){
                    if(a[i]==b[j] &&
                            a[i]==c[z]){
                        k++;
                    }
                }
            }
            if(k>0){
                System.out.print(a[i]+" " );
            }

        }
    }

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
        System.out.print("Enter your array size: ");
        int n2 = sc.nextInt();
        int[] c= new int[n2];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n2;i++){
            c[i]=sc.nextInt();
        }
        commonElmtInArray ob = new commonElmtInArray();
        ob.common(a,b,c);
    }
}

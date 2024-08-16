/*Q5.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80*/
package Assignment18;

import java.util.Scanner;

public class commonIn3Arrays {

    int a1[];
    int b1[];
    int c1[];
    commonIn3Arrays(int a[],int b[],int c[]){
        a1=a;
        b1=b;
        c1=c;
    }

    public void common(){
        int k=0;
        System.out.print("Common Elements: ");
        for(int i=0;i<a1.length;i++){
            k=0;
            for(int j=0;j<b1.length;j++){
                for(int z=0;z<c1.length;z++){
                    if(a1[i]==b1[j] &&
                            a1[i]==c1[z]){
                        k++;
                    }
                }
            }
            if(k>0){
                System.out.print(a1[i]+" " );
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
        commonIn3Arrays ob = new commonIn3Arrays(a,b,c);
        ob.common();
    }
}
/******************************OUTPUT********************************
 Enter your array size: 6
 Enter your array element: 1 5 10 20 40 80
 Enter your array size: 5
 Enter your array element: 6 7 20 80 100
 Enter your array size: 8
 Enter your array element: 3 4 15 20 30 70 80 120
 Common Elements: 20 80
 *******************************************************************/
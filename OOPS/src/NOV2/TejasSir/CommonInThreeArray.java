/*Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80*/
package NOV2.TejasSir;


import java.util.Scanner;

interface ArraySum{
    void common(int a[],int b[],int c[]);
}

class Common implements ArraySum{
    public void common(int a[],int b[],int c[]){
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <b.length ; j++) {
                for (int k = 0; k < c.length; k++) {
                    if (a[i]==b[j] && a[i]==c[k]){
                        System.out.print(a[i]+" ");
                    }
                }
            }
        }
    }
}


public class CommonInThreeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Array size: ");
        int s1 = sc.nextInt();
        int b[] = new int[s1];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s1; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print("Enter Array size: ");
        int s2 = sc.nextInt();
        int c[] = new int[s2];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s2; i++) {
            c[i] = sc.nextInt();
        }
        ArraySum ob = new Common();
        ob.common(a,b,c);
    }
}

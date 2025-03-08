/*Write a program to find the maximum element in an array.
*/
package NOV1.TejasSir1;

import java.util.Scanner;

abstract class demo{
    abstract void max(int a[]);
}
class demo2 extends demo{
    public void max(int a[]){
        int max =a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max= a[i];
            }
        }
        System.out.print("Max element is: "+max);
    }
}

public class MaximumElmtAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        demo2 ob = new demo2();
        ob.max(a);

    }
}

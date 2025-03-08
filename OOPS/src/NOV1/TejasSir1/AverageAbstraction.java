/*Write a program to find the average of all elements in an array.
*/
package NOV1.TejasSir1;

import java.util.Scanner;


class avg1 extends avg{
    public void average(int a[]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        float avgg= sum/a.length;
        System.out.print("Average : "+avgg);
    }
}

public class AverageAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        avg1 ob = new avg1();
        ob.average(a);
    }
}

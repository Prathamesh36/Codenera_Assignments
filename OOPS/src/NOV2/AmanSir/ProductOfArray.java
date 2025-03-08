/*6. Given an array nums[] of size n, construct a Product Array P (of same size n)
such that P[i] is equal to the product of all the elements of nums except nums[i].
Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation:
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.*/
package NOV2.AmanSir;
import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[a.length];
        int multi = 1;
        for (int i = 0; i < a.length; i++) {
            multi=1;
            for (int j = 0; j < a.length; j++) {
                if (a[i] != a[j]) {
                    multi *= a[j];
                }
            }
            b[i] = multi;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}

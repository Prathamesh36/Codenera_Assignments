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
package Assignment17;

import java.util.Scanner;

public class productOfElmt {

    public int[] product(int []a){
        int product =1 ;
        int b[]= new int[a.length];
        for(int i=0;i<a.length;i++){
            product=1;
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    product = product * a[j];
                }
            }
            b[i]=product;

        }
        return b;
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
        productOfElmt ob = new productOfElmt();
        System.out.print("Output: ");
        int g[]= ob.product(a);
        for (int el : g) {
            System.out.print(el+" ");
        }
    }
}
/******************OUTPUT********************
 Enter your array size: 5
 Enter your array element: 10 3 5 6 2
 Output: 180 600 360 300 900
 ********************************************/

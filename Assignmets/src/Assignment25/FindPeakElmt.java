/*6. Find a peak element which is not smaller than its neighbours

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
*/
package Assignment25;

import java.util.Scanner;

public class FindPeakElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }for(int i=1; i<a.length;i++){
            if(a[i]>a[i-1]  && a[i]>a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
    }
}
/***************************OUTPUT*******************************
 Enter your array length: 4
 Enter your array element: 5 10 20 15
 20
 ***************************************************************/
/*7.K’th Largest Element in Unsorted Array
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4
Output: 10 */
package OCT20.TejasSir;

import java.util.Scanner;

public class kthLargestElmt {

    public int largest(int a[],int p){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int t =0;//3 4 7 10
        for(int i=0;i<a.length;i++){
            if(i==p){
               t=a[i-1];
            }

        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Position: ");
        int p = sc.nextInt();
        kthLargestElmt ob = new kthLargestElmt();
        System.out.print("Largest element at given position is: "+ob.largest(a,p));

    }
}
/***************************OUTPUT*******************************
 Enter Array size: 6
 Enter Array element: 7 10 4 3 20 15
 Enter Position: 3
 Largest element at given position is: 7
 ***************************************************************/

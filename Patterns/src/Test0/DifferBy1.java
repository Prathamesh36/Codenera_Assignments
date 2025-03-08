/*Q4.Check if a number is jumbled or not? A number is said to be Jumbled if for every digit, its neighbours digit differs by max 1.

Input : 6765
Output : True
All neighbour digits differ by atmost 1.

Input : 1223
Output : False

Input : 1235
Output : False*/
package Test0;

import java.util.Scanner;

public class DifferBy1 {

    public boolean differ(int a[]){
        int c=0;
        for(int i=1;i<a.length;i++) {
            if (a[i]-a[i-1]!=1 && a[i]-a[i-1]!=-1) {
                c++;
            }
        }
        if(c==0){
            return true;
        }
        return false;


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
        DifferBy1 ob = new DifferBy1();
        System.out.print("Output: "+ob.differ(a));
    }
}
/************************OUTPUT***************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 5
 Output: true
 **********************************************************/

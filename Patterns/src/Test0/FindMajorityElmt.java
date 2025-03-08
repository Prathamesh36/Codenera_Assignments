/*Q13.Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

  Examples :

  Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
  Output : 4*/
package Test0;

import java.util.Scanner;

public class FindMajorityElmt {

    public int majorityElmt(int c[]){
        int max=0;
        int u=0;
        for(int i=0;i<c.length;i++) {
            int k = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    k++;
                    c[j] = -1;
                }
            }
            if(k>max && c[i]!=-1) {
                max= k;
                u =c[i];
            }
        }
        return u;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int [s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        FindMajorityElmt ob = new FindMajorityElmt();
        System.out.print("Majority Element is: "+ob.majorityElmt(a));
    }
}
/**************************OUTPUT****************************
 Enter Array size: 9
 Enter Array element: 3 3 4 2 4 4 2 4 4
 Majority Element is: 4
 **********************************************************/
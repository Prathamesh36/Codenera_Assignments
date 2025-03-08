/*Q10.
Choose two elements from the given array such that their sum is not present in any of the arrays

Input: A[] = {3, 2, 2}, B[] = {1, 5, 7, 7, 9}
Output: 3 9
3 + 9 = 12 and 12 is not present in
any of the given arrays.
Input: A[] = {1, 3, 5, 7}, B[] = {7, 5, 3, 1}
Output: 7 7 */
package Test0;

import java.util.Scanner;

public class SumNotPresentInArray {

    public void sum(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }

        int k=0;
        int y=0;
        for(int i=0;i<c.length;i++){
            for (int j=i+1;j<c.length;j++){
                int sum = c[i]+c[j];
               // System.out.print(sum+" ");
                k=0;
                for(int x=0;x<c.length;x++){
                    if(sum==c[x]){
                        k++;
                    }
                }
              // System.out.println(k+"*");
               if(k==0 && y==0){
                  System.out.print(c[i]+","+c[j]);
                  y++;
               }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array 1 size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array 1 element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Array 2 size: ");
        int s1= sc.nextInt();
        int []b = new int[s1];
        System.out.print("Enter Array 2 element: ");
        for(int i=0;i<s1;i++){
            b[i]=sc.nextInt();
        }

        SumNotPresentInArray ob = new SumNotPresentInArray();
        System.out.print("Output: ");
        ob.sum(a,b);
    }
}
/**************************OUTPUT****************************
 Enter Array 1 size: 4
 Enter Array 1 element: 1 3 5 7
 Enter Array 2 size: 4
 Enter Array 2 element: 7 5 3 1
 Output: 1,3
 **********************************************************/

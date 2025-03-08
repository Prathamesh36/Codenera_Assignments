/*Q.3 Find the majority element in the array. A majority element in an array A[] of size n is an element
   that appears more than n/2 times (and hence there is at most one such element).

Examples :

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4

*/
package OCT17.TejasSir;

import java.util.Scanner;

public class majorityElements {

    public void major(int a[]){
        int c =1;
        int max =0 ;
        int k=0;
        for(int i=0;i<a.length;i++){
            c =1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c>(a.length/2) && a[i]!=-1){
                System.out.print("Majority element is: "+a[i]);
            }
        }
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
        majorityElements ob = new majorityElements();
        ob.major(a);
    }
}

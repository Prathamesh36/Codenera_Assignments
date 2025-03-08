/*Q2.Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
*/
package OCT16.TejasSir;

import java.util.Scanner;

public class findLeaderElmt {

    public void findLeader(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int c=0;
        System.out.print("Leader Elements: ");
        for(int i =0;i<a.length;i++){
            c=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    c++;
                }
            }
            if(c==0){
                System.out.print(a[i]+" ");
            }

        }


    }

    public static void main(String[] args) {
        findLeaderElmt ob = new findLeaderElmt();
        ob.findLeader();
    }
}

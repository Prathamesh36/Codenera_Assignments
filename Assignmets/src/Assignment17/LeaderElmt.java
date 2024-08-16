/*4. Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2*/
package Assignment17;

import java.util.Scanner;

public class LeaderElmt {

    public int findLeader(int[] a){

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
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        LeaderElmt ob= new LeaderElmt();
        ob.findLeader(a);
    }
}
/******************OUTPUT********************
 Enter your array length: 6
 Enter your array element: 16 17 4 3 5 2
 Leader Elements: 17 5 2
 ********************************************/

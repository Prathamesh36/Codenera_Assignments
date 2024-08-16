/*2.Given an array arr of size n and an integer X.
Find if there's a triplet in the array which sums up to the given integer X.*/
package Assignment17;

import java.util.Scanner;

public class tripletSum {

    public int triplet(int[] a, int s){
        System.out.print("Triplet whose sum equal to "+s+" is: ");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==s){
                        System.out.print("["+a[i]+","+a[j]+","+a[k]+"]");
                    }
                }
            }
        }
        return 0;
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
        System.out.print("Enter your number: ");
        int s = sc.nextInt();
        tripletSum ob = new tripletSum();
        ob.triplet(a,s);
    }
}
/******************OUTPUT********************
 Enter your array size: 8
 Enter your array element: 5 2 7 -1 4 6 3 1
 Enter your number: 6
 Triplet whose sum equal to 6 is: [5,2,-1][2,3,1][-1,4,3][-1,6,1]
 ********************************************/
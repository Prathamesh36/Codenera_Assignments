package SlidingWindow;

import java.util.Scanner;

public class MaximumSumSubarrayOfSizeK {

    public static int MaxSumOfSubArray(int a[],int k){
        int start=0;
        int end=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        while(end<a.length){
            sum+=a[end];
            if(end-start+1<k){
                end++;
            }
            else if(end-start+1==k){
                max = Math.max(max,sum);
                sum-=a[start];
                start++;
                end++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Size of SubArray: ");
        int k=sc.nextInt();
        System.out.print("Maximum sum of SubArray of size k is: "+MaxSumOfSubArray(a,k));
    }
}

package ThinkitiveTechPractive;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElmt {

    public static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array1 size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        System.out.print("Kth smallest Element is: "+kthSmallest(a,k));
    }
}

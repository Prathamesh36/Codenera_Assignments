/*14. Given an array of N integers where each value represents the number of chocolates in a packet.
    Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
Output: Minimum Difference is 2
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.*/
package Test11;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. Chocolates Packets: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter each Packet Size: ");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("Enter Minimum Difference: ");
        int m = sc.nextInt();
        Arrays.sort(a);
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i+m-1<n; i++) {
            int diff=a[i+m-1]-a[i];
            if(diff<minDiff){
                minDiff=diff;
            }
        }

        System.out.print("Minimum Difference is: "+minDiff);
    }
}
/***********************OUTPUT************************
 Enter no. Chocolates Packets: 7
 Enter each Packet Size: 7 3 2 4 9 12 56
 Enter Minimum Difference: 3
 Minimum Difference is: 2
 ****************************************************/


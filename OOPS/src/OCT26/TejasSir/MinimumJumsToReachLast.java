/*11.Given an array arr[] where each element represents the max number of steps that can be made forward from that index.
   The task is to find the minimum number of jumps to reach the end of the array starting from index 0. If the end isn’t reachable, return -1.
   Examples:
   Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
   Output: 3 (1-> 3 -> 9 -> 9)
   Explanation: Jump from 1st element to 2nd element as there is only 1 step.
   Now there are three options 5, 8 or 9. I
   f 8 or 9 is chosen then the end node 9 can be reached. So 3 jumps are made.
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Jumps{
    int a[];

    Jumps(int a[]){
        this.a=a;

    }

    public void Numbers(){
        System.out.print("Minimum Jumps: ");
        int c=0;
        for(int i=0;i<a.length-1;i=i+a[i]){
            c++;
        }
        System.out.print(c);
    }
}

public class MinimumJumsToReachLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Tower height: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }

        Jumps ob= new Jumps(a);
        ob.Numbers();
    }
}

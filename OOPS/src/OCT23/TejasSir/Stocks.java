/*The cost of a stock on each day is given in an array.
Find the maximum profit that you can make by buying and selling on those days.
If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

Examples:

Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
                       Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
                       Maximum Profit  =210+655=865*/
package OCT23.TejasSir;
import java.util.Scanner;


public class Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u =0;
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int maxPro = 0;

        for (int i=1;i<a.length;i++) {
            if (a[i]>a[i-1]) {
                maxPro+=a[i]-a[i-1];
            }
        }

        System.out.print("Max Profit is: "+maxPro);
    }
}

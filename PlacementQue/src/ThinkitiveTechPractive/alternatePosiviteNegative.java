/*11. Alternate positive and negative numbers
        Input:
        N = 9
        Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
        Output:
        9 -2 4 -1 5 -5 0 -3 2
*/
package ThinkitiveTechPractive;

import java.util.Scanner;

public class alternatePosiviteNegative {

    public static int[] alternatePosiNega(int[]a ){
        return new int[5];
    }
    /// pending
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("OUTPUT: "+alternatePosiNega(a));
    }
}

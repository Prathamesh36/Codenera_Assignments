/*solve pattern by using while loop

n=17
output:
1 2 3 4 5*****
11 12 13 14 15 * *

n=12

1 2 3 4 5 * * * * *
11 12


n=10
1 2 3 45 * * * * * */
package FEB21;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j=0;
        while (j != n) {
            j++;
            if(i<=5){
                System.out.print(j+" ");
            }
            else{
                System.out.print("* ");
            }
            if(i==10){
                i=0;
                System.out.println();
            }
            i++;
        }
    }
}

/*Check if a number is jumbled or not? A number is said to be Jumbled if for every digit, its neighbours digit differs by max 1.

Input : 6765
Output : True
All neighbour digits differ by atmost 1.

Input : 1223
Output : False

Input : 1235
Output:False*/
package OCT16.TejasSir;

import java.util.Scanner;

public class difference1 {

    public void diff(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int c=0;
        for(int i=1;i<a.length;i++) {
            if (a[i] - a[i - 1] != 1 && a[i] - a[i - 1] != -1) {
                c++;
            }
        }
        if(c==0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }

    public static void main(String[] args) {
        difference1 ob = new difference1();
        ob.diff();
    }
}

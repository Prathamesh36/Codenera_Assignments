/*Given an array with all even elements present even number of times except one which is
 present odd number of times. Find that element.

input_array = [2, 4, 2, 4, 3,6,3]
Output:6*/
package OCT31;

import java.util.Scanner;



public class PrintEven {

    public int even(int[] a){
        int c=1;
        int s=0;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]) {
                    c++;
                    a[j] = -1;
                }
            }
            if(a[i]!=-1 && c%2!=0){
                s=a[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }

        PrintEven ob = new PrintEven();

        System.out.print("Output: " + ob.even(a));
    }
}

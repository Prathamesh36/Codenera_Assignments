/*1.Given an array, rotate the array by one position in clock-wise direction.
Input:
N = 5
A[] = {1, 2, 3, 4, 5}*/
package Assignment17;
import java.util.Scanner;
public class rotateArray {

    public int[] rotation(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ratations: ");
        int k = sc.nextInt();

        for (int j=0;j<k;j++) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
        return a;
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
        rotateArray ob = new rotateArray();
        int g[] = ob.rotation(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");
        }
    }
}
/******************OUTPUT********************
 Enter your array size: 5
 Enter your array element:
 1 2 3 4 5
 Enter number of ratations: 2
 4 5 1 2 3
 ********************************************/
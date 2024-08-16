/*3.Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer.
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2*/
package Assignment17;
import java.util.Scanner;
public class rotateArrayLeft {

    public int[] rotation(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        for (int j=0;j<k;j++) {
            int temp = a[0];
            for (int i=0;i<a.length-1;i++) {
                a[i] = a[i + 1];
            }
            a[a.length-1] = temp;
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
        rotateArrayLeft ob = new rotateArrayLeft();
        int g[] = ob.rotation(a);
        System.out.print("Array after left rotations: ");
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");
        }
    }
}
/******************OUTPUT********************
 Enter your array size: 5
 Enter your array element: 1 2 3 4 5
 Enter number of rotations: 3
 Array after left rotations: 4 5 1 2 3
 ********************************************/

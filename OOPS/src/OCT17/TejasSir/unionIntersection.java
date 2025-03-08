/*Q4.Given two unsorted arrays that represent two sets (elements in every array are distinct), find the union and intersection of two arrays.

Example:

arr1[] = {7, 1, 5, 2, 3, 6}
arr2[] = {3, 8, 6, 20, 7}
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}. Note that the elements of union and intersection can be printed in any order.
*/
package OCT17.TejasSir;

import java.util.Scanner;

public class unionIntersection {

    public void unionIntersection1(int[] a,int[] b){
        int c[] = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        System.out.print("Intersection is : ");
        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(k>1 && c[i]>-1){
                System.out.print(c[i]+" " );
            }
        }
        System.out.println();
        System.out.print("Union is : ");
        for(int i=0;i<c.length;i++) {
            int k = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    k++;
                    c[j] = -1;
                }
            }
            if (k > 0 && c[i] > -1) {
                System.out.print(c[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter your array 2 length: ");
        int n1= sc.nextInt();
        int b[]=new int[n1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<n1;i++){
            b[i]= sc.nextInt();
        }
        unionIntersection ob = new unionIntersection();
        ob.unionIntersection1(a,b);
    }
}

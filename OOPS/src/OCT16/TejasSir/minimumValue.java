/*Q4.You are given two arrays, A and B, of equal size N. The task is to find the minimum value of A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.


Example 1:
Input:
N = 3
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23
*/
package OCT16.TejasSir;

import java.util.Scanner;

public class minimumValue {

    public void miniValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter your array length: ");
        int n1= sc.nextInt();
        int b[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n1;i++){
            b[i]= sc.nextInt();
        }


        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]<b[j]){
                    int temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum = sum+(a[i]*b[i]);
        }

        System.out.print("Minimum Value: "+sum);


    }

    public static void main(String[] args) {
        minimumValue ob = new minimumValue();
        ob.miniValue();
    }
}

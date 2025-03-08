/*check the sequence of element either which fabnooci number sequence in array.

int[] arr={0,1,1,2,3,5,8}
Output=7

input-2:
int[] arr={0,1,1,4,3,4,8}
Output: 3*/
package JAN8;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSequence {

    public static int[] fibo(int size){
        int[] b = new int[size];
        int n1=0;
        int n2 =1;
        b[0]=n1;
        b[1]=n2;
        for(int i=2;i<size;i++) {
            int n3 = n1 + n2;
            b[i]=n3;
            n1 = n2;
            n2 = n3;
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = {0,1,1,4,3,4,8};
        int size = a.length;
     //  System.out.println(Arrays.toString(fibo(size)));
        int[] c= fibo(size);
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==c[i]){
                count++;
            }
            else break;
        }
        System.out.println("Array: "+Arrays.toString(a));
        System.out.print("OUTPUT: "+count);
    }

}

/*11. 12. Move all negative elements to end
Input :
n = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1  3  2  11  6  -1  -7  -5
*/
package ThinkitiveTechPractive;

import java.util.Arrays;
import java.util.Scanner;

public class moveAllNegativeAtEnd {

    public static void swap(int[]x, int a,int b){
        int temp = x[a];
        x[a]=x[b];
        x[b]=temp;
    }

    public static int[] moveNegToEnd(int[] a){
        int left=0;
        int right=a.length-1;

        while (left<right){
            if(a[left]<0 && a[right]>0){
                swap(a,left,right);
                left++;
                right--;

            }
            if(a[left]>0){
                left++;

            }
            if(a[right]<0){
                right--;

            }

        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Alternate positive and negative: ");
        int b[] = moveNegToEnd(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

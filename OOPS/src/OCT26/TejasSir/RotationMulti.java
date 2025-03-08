/*8.Given an array arr[] of n integers, find the maximum that maximizes the sum of the value of i*arr[i] where i varies from 0 to n-1.
  Examples:
  Input: arr[] = {8, 3, 1, 2}
  Output: 29
  Explanation: Lets look at all the rotations,
 {8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
 {3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
 {1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
 {2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Rotate{
    int a[];
    Rotate(int a[]){
        this.a=a;
    }


    public void rotateArray(){
        int m = a.length-1;
        int max=0;
        for(int j=1;j<=m;j++) {

            int temp = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;

            int multi=0;

            for (int i = 0,u=0; i < a.length; i++,u++) {
                multi +=a[i]*u;
            }
            if(multi>max){
                max= multi;
            }
         //  System.out.println(multi);
        }
        System.out.print("Max is: "+max);

    }
}

public class RotationMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }

        Rotate ob = new Rotate(a);
        ob.rotateArray();
    }
}

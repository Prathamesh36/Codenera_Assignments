/*2.Find the minimum and maximum element in an array*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class MaxAndMin {

    int s;
    int[] a;
    MaxAndMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public int max(){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        return max;
    }
    public int min(){

        int min=999;

        for(int i=0;i<a.length;i++){

            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MaxAndMin ob = new MaxAndMin();

        System.out.println("Max is: "+ob.max());
        System.out.println("Min is: "+ob.min());
    }
}

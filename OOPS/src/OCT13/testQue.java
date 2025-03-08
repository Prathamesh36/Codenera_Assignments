/*Q5.Write a Java program to find the maximum absolute difference between any two elements in an integer array, where the second element appears after the first element in the array.*/
package OCT13;
import java.util.Scanner;
public class testQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={9,8,6,1,1,5,3};
        int max=0;
        int min=9999;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }

        }
        int diff = max - min;
        System.out.print("maximum difference is: "+diff);


    }
}
/********************OUTPUT******************
 maximum difference is: 7
 *******************************************/
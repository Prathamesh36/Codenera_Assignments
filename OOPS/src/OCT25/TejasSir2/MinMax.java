/*Q4. How do you find the largest and smallest number in an unsorted integer array size 10.
 input in constructor and final result through the method.
*/
package OCT25.TejasSir2;

import java.util.Scanner;

public class MinMax {
    int a[];
    MinMax(int[] a){
        this.a=a;
    }
    public void minmaxx(){
        int max =0;
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("Largest number is: "+max);
        System.out.print("\nsmallest numbrt is: "+min);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        MinMax ob= new MinMax(a);
        ob.minmaxx();
    }
}

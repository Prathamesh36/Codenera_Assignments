/*Q6.Wap to input an array and find the 2nd max element using constructor.
*/
package OCT25.TejasSir2;

import java.util.Scanner;

public class SecondMax {
    int a[];
    SecondMax(int[] a){
        this.a=a;
    }
    public void smaxx(){
        int max =0;
        int smax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max= a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax= a[i];
            }

        }
        System.out.print("Second max element is: "+smax);


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
        SecondMax ob= new SecondMax(a);
        ob.smaxx();
    }
}

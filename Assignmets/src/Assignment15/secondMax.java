/*Q5.Wap enter an array and find the second max element.*/
package Assignment15;

import java.util.Scanner;

public class secondMax {

    public void smax(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elemets: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max =0;
        int smax=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }

        }
        System.out.print("Second max element is: ");
        System.out.print(smax);


    }
    public static void main(String[] args) {
        secondMax ob = new secondMax();
        ob.smax();
    }
}

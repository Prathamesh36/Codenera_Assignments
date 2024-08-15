/*Q6.Wap enter an array and find the second min element.*/
package Assignment15;

import java.util.Scanner;

public class secondMin {

    public void smin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int min =Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                smin=min;
                min=a[i];
            }
            else if(a[i]<smin && a[i]>min){
                smin=a[i];
            }

        }
        System.out.print("Second min element is: ");
        System.out.print(smin);


    }

    public static void main(String[] args) {
        secondMin ob = new secondMin();
        ob.smin();
    }
}

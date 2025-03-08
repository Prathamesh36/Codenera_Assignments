package OCT17.TejasSir;

import java.util.Scanner;

public class secondMaxMin {

    public void maxMin(int[] a){
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
        System.out.println(smax);

        int min =9999;
        int smin=9999;
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
        secondMaxMin ob= new secondMaxMin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        ob.maxMin(a);
    }
}

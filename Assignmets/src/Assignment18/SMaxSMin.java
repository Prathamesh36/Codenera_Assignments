package Assignment18;

import java.util.Scanner;

public class SMaxSMin {

    int a[];
    int max;
    int smax;
    int min ;
    int smin;
    SMaxSMin(int b[]){
        a=b;
    }

    public void smaxsmin(){
        max =0;
        smax=-1;
        min =9999;
        smin=9999;
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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        SMaxSMin ob= new SMaxSMin(a);
        ob.smaxsmin();
    }
}
/******************************OUTPUT********************************
 Enter your array size: 6
 Enter your array element: 1 8 4 2 3 9
 Second max element is: 8
 Second min element is: 2
 *******************************************************************/

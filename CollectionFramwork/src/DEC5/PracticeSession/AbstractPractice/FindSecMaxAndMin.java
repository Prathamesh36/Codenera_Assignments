package DEC5.PracticeSession.AbstractPractice;

import java.util.Scanner;
abstract class Solve8{
    abstract int Smax(int[] a);
    abstract int Smin(int[] a);

}

public class FindSecMaxAndMin extends Solve8{
    int Smax(int[] a){
        int max =Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }

        }
        return smax;
    }
    int Smin(int[] a){
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
        return smin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array 1 element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        FindSecMaxAndMin ob = new FindSecMaxAndMin();
        System.out.println("Second Max: "+ob.Smax(a));
        System.out.println("Second Min: "+ob.Smin(a));


    }
}
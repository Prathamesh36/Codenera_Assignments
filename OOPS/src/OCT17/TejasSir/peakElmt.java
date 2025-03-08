package OCT17.TejasSir;

import java.util.Scanner;

public class peakElmt {

    public int peak(int a[]){
        for(int i=1; i<a.length;i++){
            if(a[i]>a[i-1]  && a[i]>a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        peakElmt ob = new peakElmt();
        ob.peak(a);
    }
}

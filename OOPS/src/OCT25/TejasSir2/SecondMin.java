package OCT25.TejasSir2;

import java.util.Scanner;

public class SecondMin {
    int a[];
    SecondMin(int[] a){
        this.a=a;
    }
    public void smin(){
        int min =9999;
        int smin=9999;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                smin=min;
                min= a[i];
            }
            else if(a[i]<smin && a[i]>min){
                smin= a[i];
            }

        }
        System.out.print("Second min element is: "+smin);


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
        SecondMin ob= new SecondMin(a);
        ob.smin();
    }
}

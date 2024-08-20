package Assignment19;

import java.util.Scanner;

class SMinnSMaxx{
    int a[];
    SMinnSMaxx(int[] a){
        this.a=a;
    }
    public int max(){
        int max =0;
        int smax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max= a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }

        }
        System.out.println("Second Max element is: "+smax);
        return smax;
    }
    public int min(){
        int min=9999;
        int smin=999;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            else if(a[i]<smin && a[i]>min){
                smin=a[i];
            }
        }System.out.println("Second Min element is: "+smin);
        return smin;
    }
}
public class SmaxSminAndTable extends SMinnSMaxx{
    SmaxSminAndTable(int a[]){
        super(a);
    }
    public void table(){
        int smax=super.max();
        int smin=super.min();
        System.out.println("Table of Second Max and Second Min element");
        for(int i=1;i<=10;i++){
            System.out.println("\t\t"+smax*i+"\t\t"+smin*i);
        }
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
        SmaxSminAndTable ob= new SmaxSminAndTable(a);
        ob.table();
    }
}
/*********************OUTPUT************************
 Enter Array size: 7
 Enter Array Element: 5 4 2 9 8 3 6
 Second Max element is: 8
 Second Min element is: 3
 Table of Second Max and Second Min element
 8		3
 16		6
 24		9
 32		12
 40		15
 48		18
 56		21
 64		24
 72		27
 80		30
 ****************************************************/
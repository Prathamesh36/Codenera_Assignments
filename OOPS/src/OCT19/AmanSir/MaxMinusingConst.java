package OCT19.AmanSir;

import java.util.Scanner;

public class MaxMinusingConst {

    int a[];
    int max =0;
    int min =999;

    MaxMinusingConst(int a1[]){
        a=a1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
            if(a[i]<min){
                min =a[i];
            }
        }
    }

    public void disp(){
        System.out.println("Max is: "+max);
        System.out.print("Min is: "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        MaxMinusingConst ob = new MaxMinusingConst(a);
        ob.disp();
    }
}

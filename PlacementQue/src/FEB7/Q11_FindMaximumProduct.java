package FEB7;

import java.util.Scanner;

public class Q11_FindMaximumProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
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
        int maxPro = max * smax;

        System.out.print("Max Product is: "+maxPro);
    }
}

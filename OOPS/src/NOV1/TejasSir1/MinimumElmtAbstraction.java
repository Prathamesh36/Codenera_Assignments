package NOV1.TejasSir1;

import java.util.Scanner;

abstract class min{
    abstract void min(int a[]);
}
class min1 extends min{
    public void min(int a[]){
        int min =a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min= a[i];
            }
        }
        System.out.print("Min element is: "+min);
    }
}

public class MinimumElmtAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        min1 ob = new min1();
        ob.min(a);
    }
}

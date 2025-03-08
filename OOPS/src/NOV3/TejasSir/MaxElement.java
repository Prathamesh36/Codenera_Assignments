package NOV3.TejasSir;

import java.util.Scanner;

public class MaxElement {

    public int max(int a[]){
        int maxx=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>maxx){
                maxx=a[i];
            }
        }
        return maxx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        MaxElement ob = new MaxElement();
        System.out.print("Max Element is: "+ob.max(a));
    }
}

package NOV3.TejasSir;

import java.util.Scanner;

class Minn{
    int a[];
    Minn(int a[]){
        this.a=a;
    }
    public int min(int a[]){
        int minnn=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>minnn){
                minnn=a[i];
            }
        }
        return minnn;
    }
}

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        Minn ob = new Minn(a);
        System.out.print("Max Element is: "+ob.min(a));
    }
}

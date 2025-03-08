package NOV1.TejasSir1;

import java.util.Scanner;

abstract class sum{
    abstract void summ(int a[]);
}
class sum1 extends sum{
    public void summ(int a[]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }

        System.out.print("Sum of all elements: "+sum);
    }
}

public class SumOfAllElmtsAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        sum1 ob = new sum1();
        ob.summ(a);
    }
}

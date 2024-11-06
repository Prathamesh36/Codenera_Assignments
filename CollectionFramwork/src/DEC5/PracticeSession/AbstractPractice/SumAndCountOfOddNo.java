package DEC5.PracticeSession.AbstractPractice;

import java.util.Scanner;

abstract class Solve1{
    abstract int Count(int[] arr);
    abstract int Sum(int[] arr);
}

public class SumAndCountOfOddNo {
    int Count(int[] arr){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1) c++;
        }
        return c;
    }
    int Sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1) sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SumAndCountOfOddNo ob = new SumAndCountOfOddNo();
        System.out.println("Count of odd no.: "+ob.Count(a));
        System.out.println("Sum of odd no.: "+ob.Sum(a));

    }
}

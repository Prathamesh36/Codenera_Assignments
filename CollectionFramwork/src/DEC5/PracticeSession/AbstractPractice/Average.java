package DEC5.PracticeSession.AbstractPractice;

import java.util.Scanner;

abstract class Method{
    abstract double findAvg(int[] arr);
}

public class Average extends Method {
    double findAvg(int[] arr){
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=arr[i];
        }
        return (sum/5);
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
        Average ob = new Average();
        System.out.println("Avg: "+ob.findAvg(a));
    }
}

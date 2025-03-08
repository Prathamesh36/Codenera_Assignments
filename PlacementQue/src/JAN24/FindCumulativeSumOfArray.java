package JAN24;

import java.util.Arrays;
import java.util.Scanner;

public class FindCumulativeSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int[] b = new int[a.length];
        int sum=0;
        int k=0;

        for (int i = 0; i < a.length; i++) {
            sum=0;
            for(int j=i;j>=0;j--){
                sum+=a[j];
            }
            b[k]=sum;
            k++;
        }
        System.out.println("Cumulative Sum: "+ Arrays.toString(b));


    }
}

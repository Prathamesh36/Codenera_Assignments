package HolidayAssignment.Array;

import java.util.Scanner;

public class AvgOfElmts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        double avg = (double) sum/a.length;
        System.out.print("Average: "+avg);
    }
}
/************************OUTPUT****************************
 Enter Array size: 5
 Enter Array element: 1 2 3 8 4
 Average: 3.6
 *********************************************************/
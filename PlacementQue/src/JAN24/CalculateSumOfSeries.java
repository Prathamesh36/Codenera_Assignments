package JAN24;

import java.util.Scanner;

public class CalculateSumOfSeries {

    public static int sum(int s){
        if(s==1) return s;
        return s+sum(s-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        System.out.println("Sum of series: "+sum(s));
    }
}

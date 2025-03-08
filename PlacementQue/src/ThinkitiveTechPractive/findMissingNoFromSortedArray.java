package ThinkitiveTechPractive;

import java.util.Scanner;

public class findMissingNoFromSortedArray {

    public static int missingNumber(int[] a){
        int totalSum=0;
        for (int i = 1; i <= a.length+1; i++) {
            totalSum+=i;
        }

        int elmtSum = 0;
        for (int i = 0; i < a.length; i++) {
            elmtSum +=a[i];
        }

        return totalSum-elmtSum;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("Missing Number is: "+missingNumber(a));
    }
}

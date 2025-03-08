package NOV21.PracticeSession;

import java.util.Scanner;

public class TrianglePropertiesTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++) {
                for (int k = 0; k <a.length; k++) {
                    if(a[i]+a[j]<=a[k] && i!=j && i!=k){
                        System.out.print("("+a[i]+","+a[j]+","+a[k]+")");
                    }
                }
            }
        }
    }
}

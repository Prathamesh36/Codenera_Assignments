/*Given two arrays X[] and Y[] of positive integers, find the number of
pairs such that x^y > y^x where x is an element from X[] and y is an
element from Y[].*/
package ThinkitiveTechPractive;

import java.util.Scanner;

public class FindNumOfPairs {

    public static int pairs(int[] x, int[] y){
        int count=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if(Math.pow(x[i],y[j])> Math.pow(y[j],x[i])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array1 size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter array2 size: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.print("Enter Array2 elements: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("OUTPUT: "+pairs(a,b));
    }
}

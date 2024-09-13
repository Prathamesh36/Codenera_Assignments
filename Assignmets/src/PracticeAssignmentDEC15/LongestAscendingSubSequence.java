package PracticeAssignmentDEC15;

import java.util.Arrays;

public class LongestAscendingSubSequence {
    public static void main(String[] args) {
        int a[]= {45, 2, 11, 9, 42, 78};
        int LTS[]=new int[a.length];
        int c=1;
        int max=0;
        int ind=0;
        for (int i = 0; i < LTS.length; i++) {
            c=1;
            for (int j = i+1; j < LTS.length; j++) {
                if (a[i]<a[j] && a[j]>a[j-1]) {
                    c++;
                }
            }
            LTS[i]=c;
            if(c>max) {
                max=c;
                ind=i;
            }
        }
        System.out.println("Array: "+ Arrays.toString(a));
        System.out.print("Longest Ascending Subsequence: ");
        for (int i = ind; i < a.length; i++) {
            System.out.print(a[i]+" ");
            for (int j = i+1; j < a.length; j++) {
                if (a[i]<a[j] && a[j]>a[j-1]) {
                    System.out.print(a[j]+" ");
                }
            }
            break;
        }
    }

}

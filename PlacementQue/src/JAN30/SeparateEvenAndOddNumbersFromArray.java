package JAN30;

import java.util.Arrays;

public class SeparateEvenAndOddNumbersFromArray {
    public static void main(String[] args) {
        int[] a ={11, 12, 13, 14, 15};
        System.out.println("Array: "+ Arrays.toString(a));
        int e=0,o=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) e++;
            else o++;
        }
        int[] even = new int[e];
        int[] odd = new int[o];
        int x=0, y=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) even[x++]=a[i];
            else odd[y++]=a[i];
        }
        System.out.println("Positive Numbers: "+Arrays.toString(even));
        System.out.println("Negative Numbers: "+Arrays.toString(odd));
    }
}

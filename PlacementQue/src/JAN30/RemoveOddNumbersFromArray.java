package JAN30;

import java.util.Arrays;

public class RemoveOddNumbersFromArray {
    public static void main(String[] args) {
        int[] a = {11, 12, 13, 14, 15};
        System.out.println("Array: "+ Arrays.toString(a));
        int c=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) c++;
        }
        int[] b = new int[c];
        int x=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                b[x++]=a[i];
            }
        }
        System.out.println("Array after removing odd numbers: "+ Arrays.toString(b));
    }
}

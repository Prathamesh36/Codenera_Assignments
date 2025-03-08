package DEC21;

import java.util.Arrays;

public class SortStringBasedOnLength {
    public static void main(String[] args) {
        String s ="java is Programming language";
        String[] a = s.split(" ");
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i].length()>a[j].length()){
                    String temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("sorted String: "+ Arrays.toString(a));
      /*  for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }*/
    }
}

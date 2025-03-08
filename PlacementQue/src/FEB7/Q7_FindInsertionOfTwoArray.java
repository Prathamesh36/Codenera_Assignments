package FEB7;

import java.util.Arrays;

public class Q7_FindInsertionOfTwoArray {
    public static void main(String[] args) {
        int[] a= {10,20,30,40,50};
        System.out.println("Array 1: "+ Arrays.toString(a));
        int[] b= {40,50,60,70,80};
        System.out.println("Array 2: "+ Arrays.toString(b));
        int c[] = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        System.out.print("Intersection is : ");
        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(k>1 && c[i]>-1){
                System.out.print(c[i]+" " );
            }
        }
    }
}
/*************************OUTPUT***************************
 Array 1: [10, 20, 30, 40, 50]
 Array 2: [40, 50, 60, 70, 80]
 Intersection is : 40 50
 ***********************************************************/
package ThinkitiveTechPractive;

import java.util.Scanner;

public class sortArray0s1s2s {

    public static int[] sortArray(int[] a){
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c0++;
            }
            if(a[i]==1){
                c1++;
            }
            if(a[i]==2){
                c2++;
            }
        }
        for (int i=0;i<c0;i++){
            a[i]=0;
        }
        for (int i=c0;i<c0+c1;i++){
            a[i]=1;
        }
        for (int i=c1+c0;i<a.length;i++){
            a[i]=2;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Alternate positive and negative: ");
        int b[] = sortArray(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

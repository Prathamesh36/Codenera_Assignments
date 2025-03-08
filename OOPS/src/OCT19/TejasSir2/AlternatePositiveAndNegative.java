package OCT19.TejasSir2;

import java.util.Scanner;

public class AlternatePositiveAndNegative {

    public static int[] alternate(int[] a){
        int c=0;
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                c++;
            }
        }
        int x=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                b[x]=a[i];
                x=x+2;
            }
        }
        int y=1;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                b[y]=a[i];
                y=y+2;
            }
        }
        return b;


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
        int b[] = alternate(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

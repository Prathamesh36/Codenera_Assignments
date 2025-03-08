package OCT20.TejasSir;

import java.util.Scanner;

public class sparateNegativePositive {

    public int[] separate(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

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
        sparateNegativePositive ob = new sparateNegativePositive();
        int g[]=ob.separate(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");

        }

    }
}

package OCT20.TejasSir;

import java.util.Scanner;

public class findMultiplePeakElmt {

    public int[] peak1(int a[]){
        int x=0;
        int b[] = new int[a.length/2];
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1]&& a[i]>a[i+1]){
                b[x]=a[i];
                x++;
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

        findMultiplePeakElmt ob = new findMultiplePeakElmt();
        int g[]=ob.peak1(a);
        for(int i=0;i<g.length;i++){
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }

    }
}

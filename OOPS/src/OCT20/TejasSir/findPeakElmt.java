package OCT20.TejasSir;

import java.util.Scanner;

public class findPeakElmt {

    public int peak(int a[]){
        int k=0;
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1]&& a[i]>a[i+1]){
                k=a[i];
            }
        }
        return k;
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

        findPeakElmt ob = new findPeakElmt();
        System.out.print("Peak Element is: "+ob.peak(a));
    }
}

package OCT18.TejasSir;

import java.util.Scanner;

public class SecondMinElmt {

    public int secondMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int min =9999;
        int smin=9999;
        for(int i=0;i<a.length;i++){

            if(a[i]<min){
                smin=min;
                min=a[i];
            }
            else if(a[i]<smin && a[i]>min){
                smin=a[i];
            }

        }
        return smin;
    }

    public static void main(String[] args) {
        SecondMinElmt ob = new SecondMinElmt();

        System.out.print("Second max element is: "+ob.secondMin());
    }
}

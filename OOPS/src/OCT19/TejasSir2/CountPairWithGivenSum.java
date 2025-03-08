package OCT19.TejasSir2;

import java.util.Scanner;

public class CountPairWithGivenSum {
    public void countSum(int a[], int num){
        System.out.print("Sub Array with given sum is: ");
        int c =0;

        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==num){
                    System.out.print("["+a[i]+","+a[j]+"]");
                    c++;
                }
            }
        }
        System.out.println();
        System.out.print("Total Pairs: "+c);
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
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        CountPairWithGivenSum ob = new CountPairWithGivenSum();
        ob.countSum(a,num);
    }
}

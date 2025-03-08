package OCT20.TejasSir;

import java.util.Scanner;

public class findMaximimDiff {

    public int maxdiff(int a[]){
        int max=0;
        int min=999;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){

                max= a[i];
            }
            if(a[i]<min){

                min= a[i];
            }
        }
        int maxDiff=max-min;
        return maxDiff;
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

        findMaximimDiff ob = new findMaximimDiff();
        System.out.print("Maximum difference is: "+ob.maxdiff(a));
    }
}

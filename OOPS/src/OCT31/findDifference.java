/*6. In a sorted array, find two numbers who’s difference is k.

Given -> 1,2, 3,4,7,8,9,11 and k=7
Output -> 1,8 or 2,9, or 4,11 (Print any one)*/
package OCT31;


import java.util.Scanner;

public class findDifference {

    public void find(int[] a,int k){
        int h=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]-a[j]==k || a[i]-a[j]==-k && h==0){
                    System.out.println(a[i]+","+a[j]);
                    h++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        findDifference ob = new findDifference();
        ob.find(a,k);

    }
}

/*8.Subarray with given Sum*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class SubArrayWithGivenSum {

    int s;
    int[] a;
    int num;
    SubArrayWithGivenSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your number: ");
        num = sc.nextInt();

    }

    public void subArray(){
        System.out.print("Sub Array with given sum is: ");
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==num){
                    System.out.println("["+a[i]+","+a[j]+"]");
                }
            }
        }
    }

    public static void main(String[] args) {
        SubArrayWithGivenSum ob = new SubArrayWithGivenSum();
        ob.subArray();
    }
}

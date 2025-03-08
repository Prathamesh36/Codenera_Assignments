/*5.Find the Kth largest and Kth smallest number in an array*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class FindKthSmallestAndLargestElmt {

    int s;
    int[] a;
    int k;
    FindKthSmallestAndLargestElmt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        k= sc.nextInt();
    }

    public void kth(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("kth Smallest element is: "+a[k]);

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("kth Largest element is: "+a[k]);
    }

    public static void main(String[] args) {
        FindKthSmallestAndLargestElmt ob = new FindKthSmallestAndLargestElmt();
        ob.kth();
    }
}

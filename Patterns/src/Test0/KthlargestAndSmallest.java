package Test0;

import java.util.Scanner;
public class KthlargestAndSmallest {

    public int smallest(int a[],int h){
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int k=0;
        for(int i=0;i<a.length;i++){
            if(i==h){
                k=a[i-1];
            }
        }
        return k;

    }
    public int largest(int a[],int h){
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int k=0;
        for(int i=0;i<a.length;i++){
            if(i==h){
                k=a[i-1];
            }
        }
        return k;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int [s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the position: ");
        int h = sc.nextInt();
        KthlargestAndSmallest ob = new KthlargestAndSmallest();

        System.out.println("kth smallest element is: "+ob.smallest(a,h));
        System.out.print("kth Largest element is: "+ob.largest(a,h));
    }
}

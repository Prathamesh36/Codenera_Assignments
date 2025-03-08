/*Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},*/
package OCT17.TejasSir;

import java.util.Scanner;

public class halfAscHaltDesc {

    public void ascDesc(int[] a){
        for(int i=0;i<a.length/2;i++){
            for(int j=i+1;j<a.length/2;j++){
                if(a[i]>a[j]){
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=a.length/2;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.print("Final Array: " );
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        halfAscHaltDesc ob = new halfAscHaltDesc();
        ob.ascDesc(a);
    }
}

package OCT26.TejasSir;

import java.util.Scanner;

class Arrays{
    int a[];
    Arrays(int a[]){
        this.a=a;
    }
    public void arrange(){
        for(int i=1;i<a.length-1;i=i+2){

            if(a[i]<a[i-1]){
                int temp = a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }
            if(a[i]<a[i+1]){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        Arrays ob = new Arrays(a);
        ob.arrange();

    }
}

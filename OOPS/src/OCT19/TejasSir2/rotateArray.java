package OCT19.TejasSir2;

import java.util.Scanner;

public class rotateArray {

    public void rotate(int a[]){
        int temp = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        System.out.print("Array after one cylindrical rotation: ");
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
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
        rotateArray ob = new rotateArray();
        ob.rotate(a);
    }

}

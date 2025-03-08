package OCT25.TejasSir2;

import java.util.Scanner;

public class SortArray {
    int a[];
    SortArray(int[] a){
        this.a=a;
    }
    public void sort(){
        System.out.print("Sorted array is: ");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        SortArray ob= new SortArray(a);
        ob.sort();
    }
}

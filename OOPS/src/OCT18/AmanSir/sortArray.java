package OCT18.AmanSir;

import java.util.Scanner;

public class sortArray {

    int s;
    int[] a;
    sortArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }
    public int[] sort(){
        for (int i =0 ;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        sortArray ob = new sortArray();
        System.out.print("Sorted array is: ");
        int g[] = ob.sort();
        for (int el:g) {
            System.out.print(el+" ");
        }
    }
}

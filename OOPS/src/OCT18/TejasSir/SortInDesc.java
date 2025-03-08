package OCT18.TejasSir;

import java.util.Scanner;

public class SortInDesc {

    public int[] desc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        SortInDesc ob = new SortInDesc();
        int f[] = ob.desc();
        System.out.print("Array in Descending order: ");

        for (int el: f) {
            System.out.print(el+" ");
        }
    }
}

/*Q3.Wap enter an array and sort that in accending order.*/
package Assignment15;

import java.util.Scanner;

public class sortInAscending {

    public void sort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elemets: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Array in Ascending order: ");
        for(int i=0;i<s;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        sortInAscending ob = new sortInAscending();
        ob.sort();
    }
}

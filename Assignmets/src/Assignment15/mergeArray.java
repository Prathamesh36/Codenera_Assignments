/*Q10.Wap input two array and merge in third array.*/
package Assignment15;

import java.util.Scanner;

public class mergeArray {

    public void merge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array 1 Elemets: ");
        for(int i=0;i<s;i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter your array 2 size: ");
        int s1 = sc.nextInt();
        int b[] = new int[s];
        System.out.print("Enter Array 2 Elemets: ");
        for(int i=0;i<s1;i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        System.out.print("Merged Array: ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }

    public static void main(String[] args) {
        mergeArray ob = new mergeArray();
        ob.merge();
    }
}

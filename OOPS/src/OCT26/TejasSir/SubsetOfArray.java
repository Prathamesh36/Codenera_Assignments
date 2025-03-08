/*16.Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not. Both arrays are not in sorted order.
   It may be assumed that elements in both arrays are distinct.
   Examples:
   Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
   Output: arr2[] is a subset of arr1[]
   Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
   Output: arr2[] is a subset of arr1[]
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Subset{
    int a[];
    int b[];
    Subset(int a[],int b[]){
        this.a=a;
        this.b=b;
    }

    public void positive(){
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]!=b[j]){
                    k++;
                }
            }

        }
        if(k==0){
            System.out.print("Array 2 is not Subset of Array1");
        }
        else{
            System.out.print("Array 2 is Subset of Array1");
        }


    }
}

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array 1 size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Array 1 elements: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Array 2 size: ");
        int s1 = sc.nextInt();
        int b[] =  new int[s];
        System.out.print("Enter Array 2 elements: ");
        for (int i = 0; i < s1; i++) {
            b[i]=sc.nextInt();
        }

        Subset ob= new Subset(a,b);
        ob.positive();
    }
}

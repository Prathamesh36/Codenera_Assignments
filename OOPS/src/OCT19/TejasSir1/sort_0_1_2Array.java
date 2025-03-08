/*7.Sort the array of 0s, 1s, and 2s*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class sort_0_1_2Array {

    int s;
    int[] a;
    sort_0_1_2Array(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public void sort(){
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c0++;
            }
            if(a[i]==1){
                c1++;
            }
            if(a[i]==2){
                c2++;
            }
        }
        for (int i=0;i<c0;i++){
            a[i]=0;
        }
        for (int i=c0;i<c0+c1;i++){
            a[i]=1;
        }
        for (int i=c1+c0;i<a.length;i++){
            a[i]=2;
        }
        System.out.print("Sorted Array: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        sort_0_1_2Array ob = new sort_0_1_2Array();
        ob.sort();
    }

}

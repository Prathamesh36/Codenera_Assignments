/*Q3..Find the duplicate from the elements Size of array will be 10;
 input in constructor and final result through the method.
*/
package OCT25.TejasSir2;

import java.util.Scanner;

public class DuplicateInArray {
    int a[];
    DuplicateInArray(int[] a){
        this.a=a;
    }
    public void duplicate(){
        int c=1;
        System.out.print("Duplicate Elements are: ");
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && c>1){
                System.out.print(a[i]+" ");
            }
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
        DuplicateInArray ob= new DuplicateInArray(a);
        ob.duplicate();
    }
}

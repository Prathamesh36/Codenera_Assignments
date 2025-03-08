/*Q9.Wap enter an array and search any particular element and find the count.
*/
package OCT25.TejasSir2;

import java.util.Scanner;

public class SearchArray {
    int a[];
    int r;
    SearchArray(int[] a,int r){
        this.a=a;
        this.r=r;
    }
    public void search(){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==r) {
                c++;
            }
        }
        if(c>0) {
            System.out.print("Number Found and total count is: "+c);
        }
        else{
            System.out.print("Number not found");
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
        System.out.print("Enter Element to search: ");
        int r = sc.nextInt();
        SearchArray ob= new SearchArray(a,r);
        ob.search();
    }
}

package OCT25.TejasSir2;

import java.util.Scanner;

public class SearchTwoElmt {
    int a[];
    int r;
    int r1;
    SearchTwoElmt(int[] a,int r,int r1){
        this.a=a;
        this.r=r;
        this.r1=r1;
    }
    public void search(){
        int c=0;
        int c1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==r) {
                c++;
            }
            if(a[i]==r1) {
                c1++;
            }
        }
        if(c>0 && c1==0) {
            System.out.print("Element 1 found");
        }
        else if(c1>0 && c==0){
            System.out.print("Element 2 found");
        }
        else if(c>0 && c1>0){
            System.out.print("Both elements found");
        }
        else{
            System.out.print("Both not found");
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
        System.out.print("Enter 1st Element to search: ");
        int r = sc.nextInt();
        System.out.print("Enter 2nd Element to search: ");
        int r1 = sc.nextInt();
        SearchTwoElmt ob= new SearchTwoElmt(a,r,r1);
        ob.search();
    }
}

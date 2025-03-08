package OCT18.TejasSir;

import java.util.Scanner;

public class SearchElmt {

    public int search(){
        Scanner sc = new Scanner(System.in);
        int u =0;
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int t = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                u=i+1;
                return u;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        SearchElmt ob = new SearchElmt();
        if(ob.search()==0) {
            System.out.print("Element not found in array");
        }
        else{
            System.out.print("Element found at " + ob.search() + " position");
        }
    }
}

package OCT17.TejasSir;

import java.util.Scanner;

public class insertElement {

    public void insert(int a[],int k,int p){
        int b [] = new int[a.length+1];
        for(int i=0;i<p-1;i++){
            b[i]=a[i];
        }
        b[p-1]=k;
        for(int i=p;i<b.length;i++){
            b[i]=a[i-1];
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

    public static void main(String[] args) {
        insertElement ob= new insertElement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int k= sc.nextInt();
        System.out.print("Enter position where you want to insert: ");
        int p = sc.nextInt();
        ob.insert(a,k,p);
    }
}

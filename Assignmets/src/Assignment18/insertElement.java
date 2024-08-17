/*Q1. Write a Java program to insert element in specific condition.*/
package Assignment18;

import java.util.Scanner;

public class insertElement {

    int b[];
    insertElement(int a[],int k,int p){
        b=new int[a.length+1];
        for(int i=0;i<p-1;i++){
            b[i]=a[i];
        }
        b[p-1]=k;
        for(int i=p;i<b.length;i++){
            b[i]=a[i-1];
        }

    }
    public void disp(){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int k= sc.nextInt();
        System.out.print("Enter position where you want to insert: ");
        int p = sc.nextInt();
        insertElement ob = new insertElement(a,k,p);
        ob.disp();
    }
}
/******************************OUTPUT********************************
 Enter Array size: 7
 Enter Array element: 1 2 3 4 5 6 7
 Enter element to insert: 22
 Enter position where you want to insert: 3
 1 2 22 3 4 5 6 7
 *******************************************************************/
package Assignment18;

import java.util.Scanner;

public class segregateEvenOdd {

    int a[];
    segregateEvenOdd(int b[]){
        a=b;
    }

    public void evenodd(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i]%2!=0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Array after Segregate Even and Odd: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        segregateEvenOdd ob = new segregateEvenOdd(a);
        ob.evenodd();
    }
}
/******************************OUTPUT********************************
 Enter Array size: 8
 Enter Array element: 1 9 5 3 2 6 7 11
 Array after Segregate Even and Odd: 2 6 11 7 3 5 9 1
 *******************************************************************/

package Assignment18;

import java.util.Scanner;

public class unionIntersection {

    int c[];
    unionIntersection(int a[]){
        c=a;
    }

    public void unionIntersection1(){

        System.out.print("Intersection is : ");
        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(k>1 && c[i]>-1){
                System.out.print(c[i]+" " );
            }
        }
        System.out.println();
        System.out.print("Union is : ");
        for(int i=0;i<c.length;i++) {
            int k = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    k++;
                    c[j] = -1;
                }
            }
            if (k > 0 && c[i] > -1) {
                System.out.print(c[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter your array 2 length: ");
        int n1= sc.nextInt();
        int b[]=new int[n1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<n1;i++){
            b[i]= sc.nextInt();
        }
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        unionIntersection ob = new unionIntersection(c);
        ob.unionIntersection1();
    }
}
/******************************OUTPUT********************************
 Enter your array 1 length: 5
 Enter your array 1 element: 7 5 2 3 6
 Enter your array 2 length: 5
 Enter your array 2 element: 3 8 6 20 7
 Intersection is : 7 3 6
 Union is : 7 5 2 3 6 8 20
 *******************************************************************/

/*10.Find the Union and Intersection of the two sorted arrays*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class UnionIntersection {

    int s;
    int[] a;
    int[] b;
    int n;
    int n1;
    UnionIntersection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 length: ");
        n= sc.nextInt();
        a=new int[n];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter your array 2 length: ");
        n1= sc.nextInt();
        b=new int[n1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<n1;i++){
            b[i]= sc.nextInt();
        }
    }

    public void unionIntersection(){
        int c[] = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
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
        UnionIntersection ob = new UnionIntersection();
        ob.unionIntersection();
    }
}

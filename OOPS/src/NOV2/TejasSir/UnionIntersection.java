/*Write a Java program to create an interface and 2 sub class 1st class find Union and second class find Intersection
Example:

arr1[] = {7, 1, 5, 2, 3, 6}
arr2[] = {3, 8, 6, 20, 7}
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}.*/
package NOV2.TejasSir;

import java.util.Scanner;

interface UnionIntersection1{
    void uniInter(int a[],int b[]);
}
class Union implements UnionIntersection1{
    public void uniInter(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        for(int i =0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i =0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        int k=1;
        System.out.print("Union: ");
      /*  for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }*/
        for (int i = 0; i < c.length; i++) {
            k=1;
            for (int j = i+1; j <c.length ; j++) {
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(c[i]!=-1){
                System.out.print(c[i]+" ");
            }
        }
    }
}
class Intersection implements UnionIntersection1{
    public void uniInter(int a[],int b[]){
        int u[] = new int[a.length+b.length];
        for(int i =0;i<a.length;i++){
            u[i]=a[i];
        }
        for(int i =0;i<b.length;i++){
            u[i+a.length]=b[i];
        }
        int k=1;
        System.out.print("Intersection: ");
        for (int i = 0; i < u.length; i++) {
            k=1;
            for (int j = i+1; j <u.length ; j++) {
                if(u[i]==u[j]){
                    k++;
                    u[j]=-1;
                }
            }
            if(u[i]!=-1 && k>1){
                System.out.print(u[i]+" ");
            }
        }
    }
}
public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Array size: ");
        int s1 = sc.nextInt();
        int b[] = new int[s1];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s1; i++) {
            b[i] = sc.nextInt();
        }
        UnionIntersection1 ob = new Union();
        ob.uniInter(a,b);
        UnionIntersection1 ob1 = new Intersection();
        ob1.uniInter(a,b);
    }
}

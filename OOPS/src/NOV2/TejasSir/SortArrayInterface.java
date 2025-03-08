/*5. Write a Java program to create an interface Sortable with a method sort() that sorts an array
of integers in ascending order. Create two classes AssendingSort and DecendingSort that implement the
Sortable interface and provide their own implementations of the sort() method.

*/
package NOV2.TejasSir;


import java.util.Scanner;

interface Sortable{
    void sort();
}
class Ascending implements Sortable{
    int a[];
    Ascending(int a[]){
        this.a=a;
    }
    public void sort(){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Ascending array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
class Descending implements Sortable{
    int a[];
    Descending(int a[]){
        this.a=a;
    }
    public void sort(){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Descending array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

public class SortArrayInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[]= new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        Sortable ob = new Ascending(a);
        ob.sort();
        System.out.println();
        Sortable ob1 = new Descending(a);
        ob1.sort();
    }
}

/*Q14.Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e.
 fill A with first p smallest elements and fill B with remaining elements.
 Example:
 Input :
 int[] A = { 1, 5, 6, 7, 8, 10 }
 int[] B = { 2, 4, 9 }
 Output:
 Sorted Arrays:
 A: [1, 2, 4, 5, 6, 7]
 B: [8, 9, 10]*/
package OCT20.TejasSir;
import java.util.Scanner;
public class FillAwithB {

    public void merge(int a[],int b[]){

        int c[] = new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }

        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        System.out.println("Sorted Arrays: ");
        System.out.print("A : ");

        for (int i=0;i<a.length;i++){
            System.out.print(c[i]+ " ");
        }
        System.out.println();
        System.out.print("B : ");
        for (int i=0;i<b.length;i++){
            System.out.print(c[i+a.length]+ " ");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array 1 size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array 1 element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Array 2 size: ");
        int s1= sc.nextInt();
        int []b = new int[s1];
        System.out.print("Enter Array 2 element: ");
        for(int i=0;i<s1;i++){
            b[i]=sc.nextInt();
        }
        FillAwithB ob = new FillAwithB();
        ob.merge(a,b);
    }
}
/**************************OUTPUT****************************
 Enter Array 1 size: 6
 Enter Array 1 element: 1 5 6 7 8 10
 Enter Array 2 size: 3
 Enter Array 2 element: 2 4 9
 Sorted Arrays:
 A : 1 2 4 5 6 7
 B : 8 9 10
 **********************************************************/
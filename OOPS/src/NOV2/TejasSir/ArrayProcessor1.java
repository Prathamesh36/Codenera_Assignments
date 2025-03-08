/*Create an interface ArrayProcessor with a method processArray that takes an array of integers as a
parameter and performs a specific operation on the elements. Implement this interface in two classes:
ArraySumProcessor to calculate the sum of the elements and ArrayProductProcessor to calculate the product
 of the elements in the array.*/
package NOV2.TejasSir;

import java.util.Scanner;

interface ArrayProcessor{
    void processArray(int a[]);
}
class ArraySumProcessor implements ArrayProcessor{

    public void processArray(int a[]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("Sum of elements: "+sum);
    }
}
class ArrayProductProcessor implements ArrayProcessor{

    public void processArray(int a[]){
        int mult=1;
        for (int i = 0; i < a.length; i++) {
            mult*=a[i];
        }
        System.out.println("Product of elements: "+mult);
    }
}
public class ArrayProcessor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[]= new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        ArrayProcessor ob = new ArraySumProcessor();
        ob.processArray(a);
        ArrayProcessor ob1 = new ArrayProductProcessor();
        ob1.processArray(a);


    }
}

/*Array Summation: Define an interface Summable with a method int sum(int[] arr) to calculate
the sum of all elements in an array. Implement this interface for various loop techniques
 like a using for loop using while loop*/

package NOV2.TejasSir;

import java.util.Scanner;

interface Summable{
    void sum(int a[]);
}

class SumFor implements Summable{

    public void sum(int a[]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("Sum of elements using for loop: "+sum);
    }
}
class SumWhile implements Summable{

    public void sum(int a[]){
        int sum=0;
        int i=0;
        while(i<a.length){
           sum+=a[i];
           i++;
        }
        System.out.println("Sum of elements using while loop: "+sum);
    }
}
public class ArraySumInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[]= new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        Summable ob = new SumFor();
        ob.sum(a);
        Summable ob1 = new SumWhile();
        ob1.sum(a);


    }
}

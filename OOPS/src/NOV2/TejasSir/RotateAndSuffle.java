/*Write a Java program to create an interface and 2 sub class 1st class rotate array and second class
suffle the array*/
package NOV2.TejasSir;
import java.util.Scanner;
import java.util.Random;
interface actions{
    void perform(int a[]);
}
class Rotate implements actions{
    public void perform(int a[]){
        int temp=a[a.length-1];
        for (int i = a.length-1; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0]=temp;
        System.out.print("Array Rotation: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
class Randomm implements actions{
    public void perform(int a[]){
        Random rn = new Random();
        for (int i = 0; i < a.length; i++) {
            int j = rn.nextInt(i+1);
            for (int k = j ; k <a.length ; k++) {
                int temp = a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
        System.out.print("Array Shuffle: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
public class RotateAndSuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        actions ob = new Rotate();
        ob.perform(a);
        System.out.println();
        actions ob1 = new Randomm();
        ob1.perform(a);
    }
}

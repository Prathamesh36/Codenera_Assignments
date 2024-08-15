/*Q9.Wap enter an array and print the square of the element which is present at even position.*/
package Assignment15;

import java.util.Scanner;

public class sqrAtEvenPosi {

    public void sqr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elemets: ");
        for(int i=0;i<s;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(i%2==1){
                a[i]=a[i]*a[i];
            }
        }
        System.out.print("Square of odd postion: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        sqrAtEvenPosi ob = new sqrAtEvenPosi();
        ob.sqr();
    }
}

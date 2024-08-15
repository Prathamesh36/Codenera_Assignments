/*Q8.Wap enter an array and print the square of the element which is present at odd position.*/
package Assignment15;

import java.util.Scanner;

public class sqrAtOddPosi {

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
            if(i%2==0){
                a[i]=a[i]*a[i];
            }
        }
        System.out.print("Square of odd postion: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        sqrAtOddPosi ob = new sqrAtOddPosi();
        ob.sqr();
    }
}

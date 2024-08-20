/*Q2.Wap enter an array and find the duplicate element and also count of that.*/
package Assignment20;

import java.util.Scanner;

abstract class Duplicate{
    abstract void numbers(int a[]);
}
class Duplicate1 extends Duplicate{
    public void numbers(int a[]){
        int c=1;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && c>1){
                System.out.print("Repeated element is: "+a[i]+" and count is :"+c);
            }
        }

    }
}
public class DuplicateElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Duplicate ob = new Duplicate1();
        ob.numbers(a);

    }
}
/***********************OUTPUT**************************
 Enter your array size: 8
 Enter your array elements: 2 5 4 4 6 3 9 4
 Repeated element is: 4 and count is : 3
 *******************************************************/
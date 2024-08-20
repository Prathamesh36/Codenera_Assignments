/*Q1.WAP to check if an array of integers contains two specified elements. */
package Assignment20;

import java.util.Scanner;

abstract class Check{
    abstract void numbers(int a[],int f,int s);
}

class Checker extends Check{
    public void numbers(int a[],int f,int s){
        int c=0;
        int c1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==f){
               c++;
            }
            if(a[i]==s){
                c1++;
            }
        }
        if(c>0 && c1==0){
            System.out.println("Only 1st number found");
        }
        else if(c1>0 && c==0){
            System.out.println("Only 2nd number found");
        }
        else if(c>0 && c1>0){
            System.out.println("Both numbers found");
        }
        else{
            System.out.println("Both numbers not found");
        }
    }
}

public class CheckTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your 1st number to search: ");
        int f = sc.nextInt();
        System.out.print("Enter your 2nd number to search: ");
        int s = sc.nextInt();
        Check ob = new Checker();
        ob.numbers(a,f,s);

    }
}
/***********************OUTPUT**************************
 Enter your array size: 6
 Enter your array elements: 2 4 8 6 9 1
 Enter your 1st number to search: 4
 Enter your 2nd number to search: 9
 Both numbers found
 *******************************************************/
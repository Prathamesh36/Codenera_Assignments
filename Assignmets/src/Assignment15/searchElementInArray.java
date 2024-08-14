/*Q1.Wap enter an array and search any particular element.*/
package Assignment15;

import java.util.Scanner;

public class searchElementInArray {


    public void search(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Elemets: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int e = sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==e){
                count++;
            }
        }
        if(count>0){
            System.out.print("Element found");
        }
        else{
            System.out.print("Element not found");
        }
    }

    public static void main(String[] args) {
        searchElementInArray ob = new searchElementInArray();
        ob.search();
    }
}

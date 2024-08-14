/*Q7.Wap enter an array and search any two element and print the result.*/
package Assignment15;

import java.util.Scanner;

public class searchTwoElements {

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
        System.out.print("Enter number to search: ");
        int e1 = sc.nextInt();
        int count=0;
        int count1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==e){
                count++;
            }
            else if(a[i]==e1){
                count1++;
            }

        }
        if(count>0 && count1==0) {
            System.out.print("1st element found");
        }
        else if (count1>0 && count==0){
            System.out.print("2nd element found");
        }
        else if(count>0 && count1>0){
            System.out.print("Both element found");
        }
        else{
            System.out.print("Both element not found");
        }


    }

    public static void main(String[] args) {
        searchTwoElements ob = new searchTwoElements();
        ob.search();
    }
}

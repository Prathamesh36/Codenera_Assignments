/*Q12.Wap to return max no in array return type with argument.*/
package Assignment20;

import java.util.Scanner;

public class MaxElmt {
    public int maxx(int a[]){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        MaxElmt ob= new MaxElmt();
        System.out.println("Max element is: "+ob.maxx(a));
    }
}
/***********************OUTPUT**************************
 Enter Array size: 6
 Enter Array element: 5 9 4 2 8 1
 Max element is: 9
 *******************************************************/
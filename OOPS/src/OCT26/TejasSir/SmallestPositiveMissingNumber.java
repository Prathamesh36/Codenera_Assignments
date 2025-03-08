/*13.Given an unsorted array arr[] with both positive and negative elements, the task is to find the smallest positive
   number missing from the array.
   Note: You can modify the original array.
   Examples:
   Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
   Output: 1
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Numbers{
    int a[];
    Numbers(int a[]){
        this.a=a;
    }

    public void positive(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int ans=1;
        for (int i = 0; i < a.length; i++) {
           if(a[i]==ans){
               ans++;
           }
        }
        System.out.print("Smallest Positive element is: "+ans);

    }
}

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Tower height: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }

        Numbers ob= new Numbers(a);
        ob.positive();
    }
}

/*Q6.Given an array of size N filled with numbers from 1 to N-1 in random order.
The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3

*/
package OCT16.TejasSir;

import java.util.Scanner;

public class findRepetitiveElement {

    public void findelemt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int c=0;


        System.out.print("Repetitive element is: ");
        for(int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c = a[i];
                }
            }
        }
        System.out.print(c);

    }

    public static void main(String[] args) {
        findRepetitiveElement ob = new findRepetitiveElement();
        ob.findelemt();
    }
}

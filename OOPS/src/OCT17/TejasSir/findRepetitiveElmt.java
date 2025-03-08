/*Q3.Given an array of size N filled with numbers from 1 to N-1 in random order. The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3
*/
package OCT17.TejasSir;

import java.util.Scanner;

public class findRepetitiveElmt {

    public void find(int a[]){
        int c=1;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c>1 && a[i]!=-1){
                System.out.print("Most repetitive element is: "+a[i]);
            }
        }
    }

    public static void main(String[] args) {
        findRepetitiveElmt ob= new findRepetitiveElmt();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        ob.find(a);
    }
}

/*Q1.Given an array of N integers. Find the first element that occurs at least K number of times.

Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
7
*/
package OCT16.TejasSir;

import java.util.Scanner;



public class firstElementOccursKTime {

    public void kOccurs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int c= 1;
        System.out.print("Enter number: ");
        int k= sc.nextInt();
        int m=0;
        for(int i =0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;

                }
            }
            if(k==c && a[i]!=-1){
                m = a[i];
                break;
            }
        }
        System.out.print("Element that occurs "+k+" times is: "+ m);
    }

    public static void main(String[] args) {
        firstElementOccursKTime ob = new firstElementOccursKTime();
        ob.kOccurs();

    }
}

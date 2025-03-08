/*12.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value.
   If there is such a triplet present in array, then print the triplet and return true. Else return false.
   Examples:
   Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
   Output: 12, 3, 9
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Triplet{
    int a[];
    int k;
    Triplet(int a[],int k){
        this.a=a;
        this.k=k;
    }

    public void Numbers(){
        int r=1;
        int y=0;
        System.out.print("OUTPUT: ");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int t=j+1;t<a.length;t++){
                    if(a[i]+a[j]+a[t]==k){
                        System.out.println("["+a[i]+","+a[j]+","+a[t]+"]");
                    }
                }
            }

        }

    }
}

public class FindTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Tower height: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Sum: ");
        int k=sc.nextInt();
        Triplet ob= new Triplet(a,k);
        ob.Numbers();
    }
}

/*Given an array with all even elements present even number of times except one
 which is present odd number of times. Find that element.

input_array = [2, 4, 2, 4, 3, 6, 3]
Output: 6*/
package OCT20.AmanSir;

import java.util.Scanner;

public class PracticeProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={2, 4, 2, 4, 3, 6, 3};
        int k=6;
        int c=1;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && c==1){
                System.out.print(a[i]);
                break;
            }
        }
    }
}

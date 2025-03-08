/*6. In a sorted array, find two numbers who’s difference is k.

Given -> 1,2, 3,4,7,8,9,11 and k=7
Output -> 1,8 or 2,9, or 4,11 (Print any one)*/
package OCT20.AmanSir;

import java.util.Scanner;

public class PracticeProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={1,2,3,4,7,8,9,11};
        int k=7;
        int u=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]-a[i]==k && u==0){
                    System.out.print(a[i]+","+a[j]+" ");
                    u++;
                }
            }
        }
    }
}

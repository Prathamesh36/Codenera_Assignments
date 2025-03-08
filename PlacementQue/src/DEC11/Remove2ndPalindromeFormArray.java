/*Wap to remove the 2nd palindrome element from array

int[] arr= {11,30,33,12,121}
output: {11,30,12,121}*/
package DEC11;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove2ndPalindromeFormArray {
    static boolean isPali(int a){
        int res=0;
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            res=(res*10)+rem;
        }
        if(a==res){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        ArrayList<Integer> ob = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(isPali(a[i]) && k!=1){
                ob.add(a[i]);
                k++;
            }
            else if(isPali(a[i]) && k==1){
                k++;
                continue;
            }
            else {
                ob.add(a[i]);
            }
        }
        System.out.println("OUTPUT: "+ob);
    }
}

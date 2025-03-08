/*swap the palindrome element from armstrong element in array
int[] arr={121,153,153,131,153}
output: {153,153,121,153,131}.*/
package DEC11;

import java.util.Scanner;

public class SwapPalindromeWithArmstrong {

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

    static boolean isArm(int a){
        int result=0;
        int digits=0;
        int b=a;
        while(b>0)
        {
            b = b/10;
            digits++;
        }
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            result=result+(int)Math.pow(rem,digits);
        }
        if(a==result){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int start =0;
        int end = a.length-1;
        while(start<a.length-1){
            if(isPali(a[start]) && isArm(a[end])){
                int temp = a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
            if(isPali(a[start]) && !isArm(a[end])){
                end--;
            }
            else {
                start++;
                end--;
            }
        }
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

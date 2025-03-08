/*2. WAP to remove and return the max sum palindrome element from array
int[] arr={11,121,33,909}
output: 909
Explanation: sum of 909=18 that is the max sum palindrome in array*/
package DEC11;

import java.util.Scanner;

public class FindMaxSumPalindromFromArray {

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

    static int sum(int a){
        int sum=0;
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            sum+=rem;
        }
        return sum;
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
        int max=0;
        int num =0;
        for (int i = 0; i < a.length; i++) {
            if(isPali(a[i])){
                if(sum(a[i])>max){
                    max=sum(a[i]);
                    num=a[i];
                }
            }
        }
        System.out.println("OutPut: "+num);
    }
}

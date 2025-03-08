/*2) wap to print check whether the element is plaindrom or not, if the element is palindrom find the sum of the element , if not then find the average of the element.

int[] arr={121, 133, 131}
output:
      121-> Palindrom->sum: 4
      133-> Not plaindrom-> Avg: 2
      131-> Palindrom-> sum: 5*/
package DEC6.AmanSir;

import java.util.Scanner;

public class FindPalindromeAngPrintSumIf {

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
        int sum =0;
        for (int i = a; i !=0 ; i=i/10) {
            int rem = i%10;
            sum+=rem;
        }
        return sum;
    }

    static int avg(int a){
        int sum =0;
        int c=0;
        for (int i = a; i !=0 ; i=i/10) {
            int rem = i%10;
            sum+=rem;
            c++;
        }
        return sum/c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={121,133,131};
        for (int i = 0; i < a.length; i++) {
            if(isPali(a[i])){
                System.out.println(a[i]+" -> Palindrome -> sum: "+sum(a[i]));
            }
            else {
                System.out.println(a[i]+" -> Not Palindrome -> avg: "+avg(a[i]));
            }
        }
    }
}

/*Q5. Wap print all palindrome no between 10 to 500 .input in constructor and print result through method.*/
package Assignment20;

import java.util.Scanner;

class Palindrome{
    int s;
    int e;
    Palindrome(int s,int e){
        this.s=s;
        this.e=e;
    }
    public void Series(){
        System.out.print("Palindrome Numbers: ");
        for (int i = s; i <e ; i++) {
            int res=0;
            for(int j=i;j!=0;j=j/10){
                int rem = j%10;
                res = (res*10)+rem;
            }
            if(res==i){
                System.out.print(res+" ");
            }
        }
    }
}
public class PalindromeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int s = sc.nextInt();
        System.out.print("Enter ending number: ");
        int e = sc.nextInt();
        Palindrome ob= new Palindrome(s,e);
        ob.Series();
    }
}
/***********************OUTPUT**************************
 Enter starting number: 10
 Enter ending number: 500
 Palindrome Numbers: 11 22 33 44 55 66 77 88 99 101 111 121 131 141 151 161 171 181 191 202 212 222 232 242 252 262 272 282 292 303 313 323 333 343 353 363 373 383 393 404 414 424 434 444 454 464 474 484 494
 *******************************************************/

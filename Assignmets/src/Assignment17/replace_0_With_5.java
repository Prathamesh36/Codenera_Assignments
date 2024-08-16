package Assignment17;

import java.util.Scanner;

public class replace_0_With_5 {

    public int replace(int n){
        int res=0;
        for(int i =n ;i!=0;i=i/10){
            int rem = i%10;
            if(rem == 0){
                rem =5;
            }
            res = (res*10)+rem;
        }
        int res1=0;
        for(int i =res ;i!=0;i=i/10){
            int rem = i%10;
            if(rem == 0){
                rem =5;
            }
            res1 = (res1*10)+rem;
        }
        return res1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        replace_0_With_5 ob = new replace_0_With_5();
        System.out.print("Output: ");
        System.out.print(ob.replace(n));
    }
}
/******************OUTPUT********************
 Enter your array size: 1004
 Output: 1554
 ********************************************/
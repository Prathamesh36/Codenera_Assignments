package NOV27;

import java.util.Scanner;

class Check {
    boolean isPali(int a){
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

    boolean isArm(int a){
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
}

public class shiftArmToLeftAndPalinToRight {
    public static void main(String[] args) {

        Check ob = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end =a.length-1;
        while(start<end) {
            if(ob.isArm(a[end])){
                int temp = a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
            }
            else {
                end--;
            }
        }
        end =a.length-1;
        while(start<end) {

            if(ob.isPali(a[start])){
                int temp = a[end];
                a[end]=a[start];
                a[start]=temp;
                end--;
            }
            else {
                start++;
            }
        }
        System.out.println("Array after shifting Armstrong to left side and palindrome to right side");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
/*
Enter your array size: 8
Enter your array element: 515 8943 9474 1634 121 7800 654 153
Array after shifting Armstrong to left side and palindrome to right side
153 1634 9474 8943 654 7800 515 121
 */
/*Q10. Wap show all the uses of this keyword.*/
package Assignment20;

import java.util.Scanner;

public class UseOfThis {
    int k ;
    int k1;

    UseOfThis(int k,int k1){
        this.k=k;
        this.k1=k1;
    }
    public void addition(){
        System.out.print("Addition is: "+(k+k1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        System.out.print("Enter your number: ");
        int k1= sc.nextInt();
        UseOfThis ob = new UseOfThis(k,k1);
        ob.addition();
    }
}
/***********************OUTPUT**************************
 Enter your number: 5
 Enter your number: 5
 Addition is: 10
 *******************************************************/
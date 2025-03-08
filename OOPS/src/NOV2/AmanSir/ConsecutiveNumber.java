package NOV2.AmanSir;

import java.util.Scanner;

public class ConsecutiveNumber {

    public boolean Conse(int s,int s1,int s2){
        if((s1==s+1) && (s2==s+2)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        System.out.print("Enter number: ");
        int s1 = sc.nextInt();
        System.out.print("Enter number: ");
        int s2 = sc.nextInt();
        ConsecutiveNumber ob = new ConsecutiveNumber();
        if(ob.Conse(s,s1,s2)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}

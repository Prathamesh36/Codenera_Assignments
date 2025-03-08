package NOV22.PracticeSession;

import java.util.Scanner;

class DefineException extends RuntimeException{
    public DefineException(){
        super("Number is odd");
    }
}

public class tryCatchQue1 {

    public void OddEven(int a){
        if(a%2==1){
            throw new DefineException();
        }else{
            System.out.println("Number is Even");
        }
    }

    public static void main(String[] args) {
        tryCatchQue1 ob = new tryCatchQue1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int a=9;
        try{
            ob.OddEven(n);
        }
        catch(DefineException e){
            System.out.println("Invalid Input......."+e);
        }
    }
}

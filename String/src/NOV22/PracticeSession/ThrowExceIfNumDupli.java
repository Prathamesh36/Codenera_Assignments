package NOV22.PracticeSession;

import java.util.Scanner;

class DuplicateNum extends RuntimeException{
    public DuplicateNum(){
        super("Duplicate Elements present");
    }
}


public class ThrowExceIfNumDupli {

    public void Duplicate(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]){
                    throw new DuplicateNum();
                }
            }
        }
    }

    public static void main(String[] args) {
        ThrowExceIfNumDupli ob = new ThrowExceIfNumDupli();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        try{
            ob.Duplicate(a);
        }
        catch(DuplicateNum e){
            System.out.println(e);
        }
    }
}

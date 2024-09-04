package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class LargestIn{
  /*  public String Largest(String a){

    }*/
}

public class LargestInDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        ArrayReverse ob = new ArrayReverse();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Reverse(str));
    }
}

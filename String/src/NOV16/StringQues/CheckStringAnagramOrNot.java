package NOV16.StringQues;

import java.util.Scanner;

class Anagram{
    String a;
    String b;
    Anagram(String a, String b){
        this.a=a;
        this.b=b;
    }
    public void check(){
        if(a.equals(b)){
            System.out.print("String is Anagram");
        }
        else{
            System.out.print("String is not Anagram");
        }
    }
}

public class CheckStringAnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter your String: ");
        String s1 = sc.nextLine();
        Anagram ob= new Anagram(s,s1);
        ob.check();
    }
}

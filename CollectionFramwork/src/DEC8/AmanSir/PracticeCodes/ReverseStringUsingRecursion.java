package DEC8.AmanSir.PracticeCodes;

import java.util.Scanner;

public class ReverseStringUsingRecursion {

    static StringBuilder sb = new StringBuilder();
    static String reverse(String a){
        if(a.length()==0){
            return sb.toString();
        }
        else{
            sb.append(a.charAt(a.length()-1));
        }
        return reverse(a.substring(0,a.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String n = sc.next();
        System.out.println("reverse String: "+reverse(n));
    }
}

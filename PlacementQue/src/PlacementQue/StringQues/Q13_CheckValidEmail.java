/*Write a function to check if a string is a valid email address.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q13_CheckValidEmail {

    public static void check(String s){
        int k=0;
        int j=0;
        int l=0;
        if(s.contains("@gmail.com") && s.endsWith("@gmail.com")){
            k++;
        }
        if(s.contains("$")||s.contains("_")||s.contains("#")||s.contains("&")||s.contains("-")){
            j++;
        }
        if(s.contains("0")||s.contains("1")||s.contains("2")||s.contains("3")||s.contains("4")||
                s.contains("5")|| s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9")){
            l++;
        }
        if(k==1 && (j>0 || l>0)){
            System.out.print("Valid E-mail Address");
        }
        else{
            System.out.print("Not valid E-mail Address");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        check(s);
    }
}
/*******************************OUTPUT********************************
 Enter your String: abcd123@gmail.com
 Valid E-mail Address

 Enter your String: abc#gmail.com
 Not valid E-mail Address
 **********************************************************************/

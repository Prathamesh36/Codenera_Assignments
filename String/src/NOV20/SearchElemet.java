package NOV20;

import java.util.Scanner;

public class SearchElemet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int c=0;
        System.out.print("Enter Element to Search: ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(ch==s.charAt(i)){
                c++;
            }
        }
        if(c>0){
            System.out.print("Element Found");
        }
        else{
            System.out.print("Element not Found");
        }
    }
}

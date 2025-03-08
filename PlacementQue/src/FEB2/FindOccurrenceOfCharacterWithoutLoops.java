package FEB2;

import java.util.Objects;
import java.util.Scanner;

public class FindOccurrenceOfCharacterWithoutLoops {

    public static int findOccurrence(String[] s,String w,int count,int idx){
        if(idx==s.length){
            return count;
        }
        if(Objects.equals(s[idx], w)) count++;
        return findOccurrence(s,w,count,idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter word to search: ");
        String w = sc.next();
        int idx=0;
        int count=0;
        System.out.println(w+" Occur "+ findOccurrence(s.split(" "),w,count,idx) + " times");
    }
}
//java python java c python java
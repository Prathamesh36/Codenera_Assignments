package NOV20;
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch=s.toCharArray();
        System.out.print("Enter your String: ");
        String s1 = sc.nextLine();
        char[] ch1=s1.toCharArray();
        int c=0;
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for (int i = 0; i < s.length(); i++) {
            if(ch[i]!=ch1[i]){
                c++;
            }
        }
        if(c!=0){
            System.out.print("String is not Anagram");
        }
        else{
            System.out.print("String is Anagram");
        }
    }
}

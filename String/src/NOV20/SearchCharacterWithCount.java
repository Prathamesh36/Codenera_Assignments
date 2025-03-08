package NOV20;

import java.util.Scanner;

public class SearchCharacterWithCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int c=0;
        int idx =0;
        System.out.print("Enter Character to Search: ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(ch==s.charAt(i)){
                c++;
                idx =i;
            }
        }
        if(c>0){
            System.out.print("Character Found at index: "+idx);
        }
        else{
            System.out.print("Character not Found");
        }
    }
}

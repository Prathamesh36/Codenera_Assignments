package NOV22.PracticeSession;

import java.util.Scanner;

public class SubStringLengthWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String r = sc.nextLine();
        String[] a= r.split(" ");
        StringBuilder sb = new StringBuilder();
        int max=0;
        int count=0;
        String z="";
        for (int j= 0; j < a.length; j++) {
            char ch[] = a[j].toCharArray();
            count=0;
            for (int i = 0; i < ch.length; i++) {
                for (int k = i+1; k <ch.length ; k++) {
                    if(ch[i]==ch[k]){
                        count++;
                    }
                }
            }
            if(count==0 && a[j].length()>max){
                max=a[j].length();
            }

        }
        System.out.print("Length of Longest SubString without repeating Character is: "+max);
    }
}

package NOV22.PracticeSession;

import java.util.Scanner;

class VowelsMissing extends RuntimeException{
    public VowelsMissing(){
        super("String Not contains Vowels");
    }
}

public class ThrowExceIfNotVowelInString {

    public void VowelCheck(String s){
        char[] ch = s.toCharArray();
        int c=0;
        for (int i = 0; i < ch.length; i++) {
           if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
               c++;
           }
        }
        if(c==0){
            throw new VowelsMissing();
        }
        else{
            System.out.println("String Contains Vowels");
        }
    }
    public static void main(String[] args) {
        ThrowExceIfNotVowelInString ob = new ThrowExceIfNotVowelInString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String n=sc.next();

        try{
            ob.VowelCheck(n);
        }
        catch(VowelsMissing e){
            System.out.println(e);
        }
    }
}

package NOV21.PracticeSession;

import java.util.Scanner;

public class StartingIndexOfMostRepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char a[]=s.toCharArray();
        int c =1;
        int max =0 ;
        int k=0;
        for(int i=0;i<a.length;i++){
            c =1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=' ';
                }
            }
            if(c>max){
                max= c;
                k= i;
            }
        }
        System.out.print("Starting index of most repetitive element is: "+k);
    }
}

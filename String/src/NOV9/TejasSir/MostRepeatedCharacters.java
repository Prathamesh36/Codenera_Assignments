package NOV9.TejasSir;

import java.util.Scanner;

public class MostRepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        char a []=str.toCharArray();
        int max=0;
        int c=0;
        char f=' ';
        for (int i = 0; i < a.length; i++) {
            c=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    c++;
                    a[j]=' ';
                }
            }
            if(a[i]!=' '&& c>max){
                max=c;
                f =a[i];
            }
        }
        System.out.print("Most repeated Character is: "+f+" (count "+max+" )");
    }
}

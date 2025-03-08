/*import java.util.*;
import java.io.*;

class Main {

    public static String LongestWord(String sen) {
        HashMap<String,Integer> hm = new HashMap<>();
        String pun="!@#$%^&*";
        String[] ans = sen.split(" ");
        for (int i = 0; i < ans.length; i++) {
            if(!ans[i].contains(pun)){
                if(hm.containsKey(ans[i])){
                    hm.put(ans[i],hm.get(ans[i])+1);
                }
                else{
                    hm.put(ans[i],0);
                }
            }
        }
        int max=0;
        String ans1="";
        for (String a : hm.keySet()){
            if(hm.get(a)>max){
                max=hm.get(a);
                ans1=a;
            }
        }
        return ans1;
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
import java.util.*;
import java.io.*;

class Main {

    public static String PowersofTwo(int num) {
        while(num>1){
            if (num%2==0){
                num=num/2;
            }
            else{
                return "false";
            }
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(PowersofTwo(num));
    }

}
import java.util.*;
import java.io.*;

class Main {

    public static String ABCheck(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='a'){

            }
        }
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(s.nextLine());
    }

}*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int min =Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                smin=min;
                min=a[i];
            }
            else if(a[i]<smin && a[i]>min){
                smin=a[i];
            }
        }
        System.out.print("Second min element is: ");
        System.out.print(smin);
    }
}
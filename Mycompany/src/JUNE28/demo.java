package JUNE28;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
      //  System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            String ans = "";
            for(String str : arr[i].split(" ")){
                System.out.println(str);
                if(!ans.contains(str)){
                    ans+=str;
                    ans+=" ";
                }
            }

            arr[i]=ans;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}

/***String Rotation:**
 Write a Java function to determine if one string is a rotation of another. For instance,
 "waterbottle" is a rotation of "erbottlewat."*/
package String;

import java.util.Scanner;
import java.util.Stack;

public class StringRotation {

    public static boolean rotationCheck(String n,String m){
        int left =0;
        int right =0;
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        Stack<String> st = new Stack<>();
        while (left<n.length()){
            sb.append(n.charAt(left));

            if(!m.contains(sb)){
                st.push(sb.substring(right,left));
                right=left-1;
                sb.delete(0, sb.length());
                left--;
            }
            left++;
        }
        if(st.size()>1){
         //   System.out.println("1");
            return false;

        }
        int c=0;
        for (int i = 0; i < 2; i++) {
            String pup = st.pop();
            System.out.println(pup);
            if(!m.contains(pup)){
              //  System.out.println("2");
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String n = sc.next();
        System.out.print("Enter String 2: ");
        String m = sc.next();
        if(rotationCheck(n,m)){
            System.out.print(n+" is a rotation of "+m);
        }
        else{
            System.out.print(n+" is a not rotation of "+m);
        }


    }
}

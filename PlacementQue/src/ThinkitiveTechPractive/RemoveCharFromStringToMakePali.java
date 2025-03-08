package ThinkitiveTechPractive;

import java.util.Scanner;

public class RemoveCharFromStringToMakePali {

    public static boolean isPali(String s,int i ,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int removeCharFromStringToMakePali(String s){
        int left =0;
        int right=s.length()-1;

        while(left<right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else{
                if(isPali(s,left+1,right)){
                    return left;
                }
                if(isPali(s,left,right+1)){
                    return right;
                }
                return -1;
            }

        }
        return -2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int idx= removeCharFromStringToMakePali(s);
        if(idx==-1){
            System.out.println("Not Possible");
        }
        else if(idx ==-2) {
            System.out.println("Yes");
        }
        else if(idx>0){
            System.out.println("Yes");
        }
    }
}

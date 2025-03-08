/*1) All the plaindrom element should be in left side and armstrong number should be in right side.

int[] arr={153,121,131,11}
output: {121,131,11,153}*/
package JAN31.Advance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AllPaliToLeftAndArmStrongToRightSide {

    public static boolean isPali(int a){
        int res=0;
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            res=(res*10)+rem;
        }
        if(a==res){
            return true;
        }
        return false;
    }
    public static boolean isArm(int a){
        int result=0;
        int digits=0;
        int b=a;
        while(b>0)
        {
            b = b/10;
            digits++;
        }
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            result=result+(int)Math.pow(rem,digits);
        }
        if(a==result){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {153,121,131,11};
        System.out.println("arr[] ="+Arrays.toString(arr));
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(isPali(arr[i])){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("Output: "+Arrays.toString(arr));

    }
}

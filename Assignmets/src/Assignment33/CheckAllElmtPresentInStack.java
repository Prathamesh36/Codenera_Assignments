/*1. Check if all array elements are present in a given stack or not
Input: S = {10, 20, 30, 40, 50}, arr[] = {20, 30}
Output: Yes
Explanation:
Elements 20 and 30 are present in the stack.*/
package Assignment33;

import java.util.Arrays;
import java.util.Stack;

public class CheckAllElmtPresentInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack: "+st);
        int[] arr ={20,30};
        System.out.println("Array: "+ Arrays.toString(arr));
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(!st.contains(arr[i])){
                c++;
            }
        }
        System.out.print("OUTPUT: ");
        if(c!=0){
            System.out.print("No");
        }
        else System.out.print("Yes");
    }
}
/**********************OUTPUT************************
 Stack: [10, 20, 30, 40, 50]
 Array: [20, 30]
 OUTPUT: Yes
*****************************************************/
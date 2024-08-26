/*10. Write a Java program to find the top and bottom elements of a given stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class FindTopAndBottomElmtOfStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        ob.push(43);
        ob.push(78);
        ob.push(11);
        ob.push(60);
        ob.push(55);
        ob.push(60);
        System.out.println("Stack: "+ob);
        System.out.println("Top Element is: "+ob.peek());
        int last=0;
        while(!ob.empty()){
            last = ob.peek();
            ob.pop();
        }
        System.out.println("Last Element is: "+last);
    }
}
/***************************OUTPUT***************************
 Stack: [43, 78, 11, 60, 55, 60]
 Top Element is: 60
 Last Element is: 43
 *************************************************************/
/*9. Write a Java program to remove duplicates from a given stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicatesFromStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        ob.push(43);
        ob.push(11);
        ob.push(78);
        ob.push(11);
        ob.push(50);
        ob.push(60);
        ob.push(55);
        ob.push(60);
        System.out.println("Stack: "+ob);
        Stack<Integer> ob1 =new Stack<>();
        while(!ob.isEmpty()){
            if(!ob1.contains(ob.peek())) {
                ob1.push(ob.peek());
            }
            ob.pop();
        }
        while (!ob1.isEmpty()){
            ob.push(ob1.pop());
        }
        System.out.println("Stack after removing duplicates: "+ob);
    }
}
/***************************OUTPUT***************************
 Stack: [43, 11, 78, 11, 50, 60, 55, 60]
 Stack after removing duplicates: [43, 78, 11, 50, 55, 60]
 *************************************************************/
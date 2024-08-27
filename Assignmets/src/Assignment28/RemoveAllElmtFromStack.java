/*6. Write a Java program to remove all elements from a stack.*/
package Assignment28;

import java.util.Stack;

public class RemoveAllElmtFromStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        ob.push(43);
        ob.push(22);
        ob.push(78);
        ob.push(11);
        ob.push(59);
        ob.push(60);
        System.out.println("Stack: "+ob);
        while(!ob.isEmpty()){
            ob.pop();
        }
        System.out.println("Stack Status: "+ob);

    }
}
/***************************OUTPUT***************************
 Stack: [43, 22, 78, 11, 59, 60]
 Stack Status: []
 *************************************************************/
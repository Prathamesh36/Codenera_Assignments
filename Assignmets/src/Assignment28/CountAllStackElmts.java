/*7. Write a Java program to count all stack elements.*/
package Assignment28;

import java.util.Stack;

public class CountAllStackElmts {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        ob.push(43);
        ob.push(22);
        ob.push(78);
        ob.push(11);
        ob.push(59);
        ob.push(60);
        System.out.println("Stack: "+ob);
        int count=0;
        while(!ob.isEmpty()){
            ob.pop();
            count++;
        }
        System.out.println("Total Elements: "+count);

    }
}
/***************************OUTPUT***************************
 Stack: [43, 22, 78, 11, 59, 60]
 Total Elements: 6
 *************************************************************/
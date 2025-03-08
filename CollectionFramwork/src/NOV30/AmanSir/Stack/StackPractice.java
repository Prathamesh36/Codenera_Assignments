package NOV30.AmanSir.Stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> ob = new Stack<Integer>();
        Stack<Integer> ob1 = new Stack<Integer>();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(50);
        System.out.println("Stack: "+ob );
        while(!ob.isEmpty()){
            ob1.push(ob.peek());
            ob.pop();
        }
        System.out.println("Reverse: "+ob1);


    }
}

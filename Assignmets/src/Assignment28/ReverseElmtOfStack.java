package Assignment28;

import java.util.Stack;

public class ReverseElmtOfStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.push(6);
        System.out.println("Stack: "+ob);
        Stack<Integer> ob1 =new Stack<>();
        while(!ob.isEmpty()){
            int a = ob.pop();
            ob1.push(a);
        }
        System.out.println("Reverse: "+ob1);

    }
}
/***************************OUTPUT***************************
 Stack: [1, 2, 3, 4, 5, 6]
 Reverse: [6, 5, 4, 3, 2, 1]
 *************************************************************/
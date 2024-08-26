/*5. Write a Java program to find the maximum and minimum elements in a
stack.*/
package Assignment28;

import java.util.Stack;

public class FindMaxAndMinElmtInStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        ob.push(43);
        ob.push(22);
        ob.push(78);
        ob.push(11);
        ob.push(59);
        ob.push(60);
        System.out.println("Stack: "+ob);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(!ob.isEmpty()){
            if(ob.peek()>max){
                max=ob.peek();
            }
            if(ob.peek()<min){
                min=ob.peek();
            }
            ob.pop();
        }
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min);
    }
}
/***************************OUTPUT***************************
 Stack: [43, 22, 78, 11, 59, 60]
 Max element: 78
 Min element: 11
 *************************************************************/
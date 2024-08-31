/*11. Write a Java program to rotate the stack elements to the right direction.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class RotateStackElmtToRight {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 stack elements: ");
        int n=1;
        while(n<=7){
            ob.push(sc.nextInt());
            n++;
        }
        System.out.println("Original Stack: "+ob);
        Stack<Integer> ob1 =new Stack<>();
        int temp=ob.pop();
        while (!ob.isEmpty()){
            ob1.push(ob.peek());
            ob.pop();
        }
        ob.push(temp);
        while (!ob1.isEmpty()){
            ob.push(ob1.peek());
            ob1.pop();
        }
        System.out.println("Right Rotation: "+ob);
    }
}
/***************************OUTPUT***************************
 Enter 7 stack elements: 7 9 5 8 4 3 1
 Original Stack: [7, 9, 5, 8, 4, 3, 1]
 Right Rotation: [1, 7, 9, 5, 8, 4, 3]
 *************************************************************/
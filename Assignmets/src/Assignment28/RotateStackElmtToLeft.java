/*12. Write a Java program to rotate the stack elements in the left direction.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class RotateStackElmtToLeft {
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
        while (!ob.isEmpty()){
            ob1.push(ob.peek());
            ob.pop();
        }
        int temp= ob1.pop();
        while (!ob1.isEmpty()){
            ob.push(ob1.peek());
            ob1.pop();
        }
        ob.push(temp);
        System.out.println("Left Rotation: "+ob);
    }
}
/***************************OUTPUT***************************
 Enter 7 stack elements: 4 9 3 1 8 5 2
 Original Stack: [4, 9, 3, 1, 8, 5, 2]
 Left Rotation: [9, 3, 1, 8, 5, 2, 4]
 *************************************************************/
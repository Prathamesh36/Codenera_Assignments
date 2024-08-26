/*16. Write a Java program to get the nth element from the bottom of the stack.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class Get_nthElmtFromBotmOfStack {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 stack elements: ");
        int m=1;
        while(m<=7){
            ob.push(sc.nextInt());
            m++;
        }
        System.out.println("Original Stack: "+ob);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int k = ob.size()-n;
       // System.out.println(k);
        for (int i = 1; i <=k; i++) {
            ob.pop();
        }
        System.out.println("nth Element from bottom is: "+ob.peek());
    }
}
/***************************OUTPUT***************************
 Enter 7 stack elements: 2 4 8 1 6 7 3
 Original Stack: [2, 4, 8, 1, 6, 7, 3]
 Enter value of n: 3
 nth Element from bottom is: 8
 *************************************************************/
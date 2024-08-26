/*26. Write a Java program that implements a stack and checks if all elements
of the stack satisfy a condition.*/
package Assignment28;

import java.util.Scanner;
import java.util.Stack;

public class CheckAllTheElmtsSatisfyCondition {
    public static void main(String[] args) {
        Stack<Integer> ob =new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements for stack 2: ");
        int m1=1;
        while(m1<=5){
            ob.push(sc.nextInt());
            m1++;
        }
        System.out.println("Stack 1: "+ob);
        int even=0;
        int odd=0;
        for (int i = 0; i < ob.size(); i++) {
            if(ob.get(i)%2==0){
                even++;
            }
            else odd++;
        }
        if(even==m1-1){
            System.out.println("All the elements are even!: true");
            System.out.println("All the elements are odd!: false");
        }
        else if(odd==m1-1){
            System.out.println("All the elements are even!: false");
            System.out.println("All the elements are odd!:  true");
        }
        else{
            System.out.println("Elements not satisfy any condition");
        }
    }
}
/***************************OUTPUT***************************
 Enter 5 elements for stack 2: 2 8 4 6 10
 Stack 1: [2, 8, 4, 6, 10]
 All the elements are even!: true
 All the elements are odd!: false
 *************************************************************/
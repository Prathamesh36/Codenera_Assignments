/*Write a program to reverse the elements of a LinkedList.*/
package PlacementQue.CollectionQues;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_ReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ArrayList<Integer> ob1= new ArrayList<Integer>();
        System.out.print("Enter Number of Elements do you want to insert: ");
        int n = sc.nextInt();
        System.out.print("Enter ArrayList Elements: ");
        for (int i = 0; i < n; i++) {
            ob.add(sc.nextInt());
        }

        for (int i = ob.size()-1; i >=0 ; i--) {
            ob1.add(ob.get(i));
        }
        System.out.println();
        System.out.print("Reverse: "+ob1);
    }
}
/**************************OUTPUT*****************************
 Enter Number of Elements do you want to insert: 10
 Enter ArrayList Elements: 1 2 3 4 5 6 7 8 9 10
 Reverse: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 ************************************************************/


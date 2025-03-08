/*3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.*/
import java.util.ArrayList;

public class Q3_SumOfAllOddEvenNumFromListUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(6);
        al.add(2);
        al.add(7);
        al.add(9);
        System.out.println("ArrayList: "+al);
        int oddSum = al.stream().filter(a -> a%2==1).mapToInt(Integer::intValue).sum();
        int evenSum = al.stream().filter(a -> a%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("Odd Number Sum: "+oddSum);
        System.out.println("Even Number Sum: "+evenSum);
    }
}
/**********************************OUTPUT*******************************
 ArrayList: [4, 3, 6, 2, 7, 9]
 Odd Number Sum: 19
 Even Number Sum: 12
 ***********************************************************************/
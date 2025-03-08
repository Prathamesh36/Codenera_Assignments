/*
1. Write a Java program to calculate the average of a list of integers using streams.
*/
import java.util.ArrayList;

public class Q1_AverageOfListOfIntegersUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(6);
        al.add(2);
        al.add(7);
        al.add(9);
        System.out.println("ArrayList: "+al);
        double ans=al.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average: "+ans);
    }
}
/**********************************OUTPUT*******************************
 ArrayList: [4, 3, 6, 2, 7, 9]
 Average: 5.166666666666667
 ***********************************************************************/
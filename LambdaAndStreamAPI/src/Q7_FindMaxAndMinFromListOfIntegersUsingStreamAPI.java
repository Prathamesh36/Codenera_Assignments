import java.util.ArrayList;
import java.util.Optional;

public class Q7_FindMaxAndMinFromListOfIntegersUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(6);
        al.add(2);
        al.add(7);
        al.add(9);
        System.out.println("ArrayList: "+al);
        int max=al.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        Optional<Integer> min=al.stream().min(Integer::compareTo);
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min.get());
    }
}
/**********************************OUTPUT*******************************
 ArrayList: [4, 3, 6, 2, 7, 9]
 Max element: 9
 Min element: 2
 ***********************************************************************/
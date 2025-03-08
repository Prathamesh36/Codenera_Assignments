package DEC7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareOfDoubleElmtsUsingStreamApi {
    public static void main(String[] args) {
        ArrayList<Double> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ob.add(5.6);
        ob.add(8.1);
        ob.add(7.3);
        ob.add(2.8);
        System.out.println("List: "+ob);
        List<Double> rd = ob.stream().map(n->n*n).toList();
        System.out.println("Square: "+rd);
    }
}

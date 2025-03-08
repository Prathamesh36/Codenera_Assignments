package JAN3.Que3;

import java.util.ArrayList;
import java.util.Collections;

public class SortPricesOfProductUsingComparable {
    public static void main(String[] args) {
        ArrayList<product> ob = new ArrayList<>();
        ob.add(new product("Camera", 250000));
        ob.add(new product("Car", 200000));
        ob.add(new product("WashingMachine", 100000));
        ob.add(new product("TV", 80000));
        ob.add(new product("", 250000));

        Collections.sort(ob);
        System.out.println("Comparison based on prices: ");
        System.out.println(ob);
    }
}

package DEC7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElmtInListOfIntegerUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ob.add(5);
        ob.add(8);
        ob.add(7);
        ob.add(9);
        ob.add(8);
        ob.add(7);
        ob.add(8);
        System.out.println("List: "+ob);
        System.out.println("Enter Number to Search: ");
        int k = sc.nextInt();
        boolean rd = ob.stream().anyMatch(n -> n == k);
        if(rd) System.out.println("Present");
        else System.out.println("Not Present");
    }
}

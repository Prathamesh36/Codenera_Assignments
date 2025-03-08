package NOV29.PracticeSession.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RetriveElmtFromGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        ob.add("java");
        ob.add("is");
        ob.add("object");
        ob.add("oriented");
        ob.add("programming");
        ob.add("language");
        System.out.println(ob);
        System.out.print("Enter Index to Retrieve element: ");
        int a = sc.nextInt();
        System.out.println(ob.get(a));
    }
}

package JAN11.TreeSetPractice;

import java.util.TreeSet;

public class GetFirstAndLastElmt {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>();
        ob.add("java");
        ob.add("python");
        ob.add("c");
        ob.add("css");
        ob.add("javascript");
        System.out.println("Tree Set: "+ob);
        System.out.println("First Element: "+ob.first());
        System.out.println("Last Element: "+ob.last());
    }
}

package DEC6;

import java.util.TreeMap;

public class SearchValueInTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> ob = new TreeMap<>();
        ob.put(108,"java");
        ob.put(188,"sql");
        ob.put(150,"python");
        ob.put(123,"c++");
        System.out.println("TreeMap: "+ob);
        System.out.println("Searching java: "+ob.containsValue("java"));
        System.out.println("Searching html: "+ob.containsValue("html"));
    }
}

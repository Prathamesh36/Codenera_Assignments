package DEC6;

import java.util.TreeMap;

public class SearchKeyInTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> ob = new TreeMap<>();
        ob.put(108,"java");
        ob.put(188,"sql");
        ob.put(150,"python");
        ob.put(123,"c++");
        System.out.println("TreeMap: "+ob);
        System.out.println("Searching 188 key: "+ob.containsKey(188));
        System.out.println("Searching 199 key: "+ob.containsKey(199));
    }
}

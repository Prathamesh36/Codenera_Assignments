package DEC6;

import java.util.TreeMap;

public class SpecifiedValueWithSpecifiedKeyTM {
    public static void main(String[] args) {
        TreeMap<Integer,String> ob = new TreeMap<>();
        ob.put(108,"java");
        ob.put(188,"sql");
        ob.put(150,"python");
        ob.put(123,"c++");
        ob.put(148,"html");
        ob.put(101,"css");
        System.out.println("TreeMap: "+ob);
    }
}

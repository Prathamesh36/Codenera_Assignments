package DEC5.AmanSir;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap ob = new TreeMap<>();

        ob.put(201,"Siddhant");
        ob.put(212,"Shubham");
        ob.put(205,"Abhishek");
        ob.put(220,"Shonak");
        ob.put(215,"Hrishabh");
        System.out.println("TreeMap: "+ob);
        System.out.println("Last Key: "+ob.lastKey());
        System.out.println("First Key: "+ob.firstKey());
        System.out.println("Last Entry: "+ob.lastEntry());
        System.out.println("First entry: "+ob.firstEntry());
        System.out.println("Descending Key Sets: "+ob.descendingKeySet());
        System.out.println("Value of 201: "+ob.get(201));
        System.out.println("Sub Tree: "+ob.subMap(205,215));
        ob.remove(205);
        System.out.println("Removed Key 205: "+ob);
    }
}

package DEC5.AmanSir;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> ob = new LinkedHashMap<>();
        ob.put("Siddhant",66);
        ob.put("Mayank",96);
        ob.put("Tushar",76);
        ob.put("Ram",56);
        ob.put("Aakash",77);
        ob.put("Lokesh",80);
        System.out.println("Linked Hash Tree: "+ob);
        System.out.println("Tushar marks: "+ob.get("Tushar"));
        ob.replace("Ram",83);
        System.out.println("Changing Ram marks: "+ob);


    }
}

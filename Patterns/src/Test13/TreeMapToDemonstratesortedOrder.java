/*Q9.Write a Java program to demonstrate the use of TreeMap to store and retrieve key-value pairs in sorted order.*/
package Test13;

import java.util.TreeMap;

public class TreeMapToDemonstratesortedOrder {
    public static void main(String[] args) {
        TreeMap<Integer,String> ob = new TreeMap<>();
        ob.put(201,"Siddhant");
        ob.put(212,"Shubham");
        ob.put(205,"Abhishek");
        ob.put(220,"Shonak");
        ob.put(215,"Hrishabh");
        System.out.println("TreeMap: "+ob);

    }
}
/************************OUTPUT*************************
 TreeMap: {201=Siddhant, 205=Abhishek, 212=Shubham, 215=Hrishabh, 220=Shonak}
 ********************************************************/
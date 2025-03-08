package Test14;

import java.util.ArrayList;

interface Demo1
{
    ArrayList<String> disp();
}

public class SortStringBasedOnLengthUsingLamb {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("Mumbai");
        ob.add("Goa");
        ob.add("Pune");
        ob.add("Nashik");
        ArrayList<String> ob1 = new ArrayList<String>();
        Demo1 ob2=()->{
            for (int i = 0; i <ob.size(); i++) {
                for (int j = i+1; j <ob.size(); j++) {
                    if(ob.get(i).length()>ob.get(j).length()){
                        String temp = ob.get(i);
                        ob.add(ob.get(i));
                        ob.add(temp);
                    }
                }
            }
            return ob;
        };
        System.out.println("Sorted String based on length : "+ob2.disp());
    }
}

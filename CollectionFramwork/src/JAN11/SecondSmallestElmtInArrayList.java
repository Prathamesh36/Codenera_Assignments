package JAN11;

import java.util.ArrayList;

public class SecondSmallestElmtInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(3);
        ob.add(1);
        ob.add(2);
        System.out.println("ArrayList: "+ob);
        int min=9999;
        int smin=0;
        for (int i = 0; i < ob.size(); i++) {
            if(ob.get(i)<min){
                smin=min;
                min=ob.set(i,ob.get(i));
            }
            else if(smin>ob.get(i) && ob.get(i)>min) {
                smin=ob.get(i);
            }
        }
        System.out.println("Second min element: "+smin);
    }
}

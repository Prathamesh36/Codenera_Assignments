package JAN11;

import java.util.ArrayList;

public class FindSecondSmallestElmt {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(3);
        ob.add(1);
        ob.add(2);
        System.out.println("ArrayList: "+ob);
        int max=0;
        int smax=0;
        for (int i = 0; i < ob.size(); i++) {
            if(ob.get(i)>max){
                smax=max;
                max=ob.set(i,ob.get(i));
            }
            else if(smax<ob.get(i) && ob.get(i)<max) {
                smax=ob.get(i);
            }
        }
        System.out.println("Second max element: "+smax);
    }
}

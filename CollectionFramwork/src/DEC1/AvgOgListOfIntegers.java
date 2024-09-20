package DEC1;

import java.util.ArrayList;

interface Avg
{
    public int disp(int a);

}

public class AvgOgListOfIntegers {
    public static void main(String[] args)
    {
        Avg ob=(a)->
        {
            int max=0;
            if(a>max) return max;
            else return a;
        };
        ArrayList<Integer> ob1 = new ArrayList<>();
        ob1.add(8);
        ob1.add(2);
        ob1.add(1);
        ob1.add(7);
        ob1.add(6);
        System.out.println(ob);
        int max=0;
        for (int i = 0; i < ob1.size(); i++) {
           max= ob.disp(ob1.get(i));
        }
        System.out.println("Max: "+max);
    }
}

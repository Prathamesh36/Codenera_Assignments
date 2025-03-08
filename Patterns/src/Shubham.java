
import java.util.ArrayList;
import java.util.Scanner;

public class Shubham {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ob.add(50);
        ob.add(12);
        ob.add(30);
        ob.add(24);
        ob.add(12);
        ob.add(20);
        ob.add(30);
        ob.add(18);
        ob.add(12);
        ob.add(24);
        System.out.println(ob);
        Object a[]=ob.toArray();
        int min=(Integer)a[0];
        int secmax=999;
        //OR int secmax=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if ((Integer) a[i] < min) {
                secmax = min;
                min = (Integer) a[i];

            } else if ((Integer) a[i] < secmax && (Integer) a[i] > min) {
                secmax = (Integer) a[i];
            }

        }
        System.out.println(secmax);
    }
}
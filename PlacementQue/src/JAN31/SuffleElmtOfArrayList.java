package JAN31;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SuffleElmtOfArrayList {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(8);
        al.add(7);
        al.add(1);
        al.add(9);
        al.add(2);
        System.out.println("ArrayList: "+al);
        for (int i = 0; i < al.size(); i++) {
            int j = rn.nextInt(i+1);
            for (int k = j ; k <al.size() ; k++) {
                int temp = al.get(i);
                al.add(al.get(k));
                al.add(temp);
            }
        }
        System.out.println("Shuffled ArrayList: "+al);

    }

}

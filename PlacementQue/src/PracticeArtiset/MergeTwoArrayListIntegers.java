package PracticeArtiset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrayListIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> al2= new ArrayList<>(Arrays.asList(6,7,8,9,10));
        al1.addAll(al2);
        System.out.println("Merged ArrayLists: "+al1);

    }
}

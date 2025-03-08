package NOV29.PracticeSession.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EmptyAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = sc.nextInt();

        System.out.print("Enter ArrayList elements: ");
        for (int i = 0; i < n; i++) {
            ob.add(sc.nextInt());
        }
        ob.clear();
        System.out.println(ob);
    }
}

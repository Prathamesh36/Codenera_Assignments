package DEC8.PracticeSession;

import java.util.ArrayList;
import java.util.Scanner;

public class FindLengthOfStringWhichStartWithA {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ob.add("anger");
        ob.add("Sea");
        ob.add("All");
        ob.add("Water");
        System.out.println("List: "+ob);
        int maxLength = ob.stream().filter(s -> s.contains("a")).mapToInt(String::length).max().orElse(0);
        System.out.println("Length: "+maxLength);
    }
}

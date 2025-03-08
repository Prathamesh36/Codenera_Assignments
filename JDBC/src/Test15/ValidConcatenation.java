package Test15;

import java.util.*;

public class ValidConcatenation {

    public static boolean canBeFormed(String str, ArrayList<String> dictionary) {

        Set<String> words = new HashSet<>(dictionary);

        Queue<String> queue = new LinkedList<>();

        queue.add(str);

        while (!queue.isEmpty()) {

            String word = queue.remove();

            if (words.contains(word)) {
                return true;
            }

            for (int i = 1; i < word.length(); i++) {
                String part1 = word.substring(0, i);
                String part2 = word.substring(i);

                queue.add(part1);
                queue.add(part2);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> ob =new ArrayList<>();
        ob.add("apple");
        ob.add("pie");
        ob.add("applepie");
        System.out.print("Dictionary: "+ob);
        String str = "applepie";
        System.out.println("String: "+str);
        boolean canBeFormed = canBeFormed(str, ob);

        System.out.println(canBeFormed); // true

        str = "apples";
        canBeFormed = canBeFormed(str, ob);

        System.out.println(canBeFormed); // false
    }
}

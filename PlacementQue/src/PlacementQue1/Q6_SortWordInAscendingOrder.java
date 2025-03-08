package PlacementQue1;

import java.util.Arrays;

public class Q6_SortWordInAscendingOrder {
    public static void main(String[] args) {
        String s = "to learn programming refer geeksforgeeks";
        System.out.println("String: "+s);
        String[] a=s.split(" ");
        Arrays.sort(a);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            ans.append(a[i]);
            ans.append(" ");
        }
        System.out.println("OUTPUT: "+ ans.toString().trim());
    }
}


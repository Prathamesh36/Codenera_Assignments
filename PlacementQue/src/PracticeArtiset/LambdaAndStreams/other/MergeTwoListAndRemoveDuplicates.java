package PracticeArtiset.LambdaAndStreams.other;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoListAndRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> mergeList= Stream.concat(list1.stream(),list2.stream()).distinct().toList();

        System.out.println("Merged list without duplicates: "+mergeList);
    }
}

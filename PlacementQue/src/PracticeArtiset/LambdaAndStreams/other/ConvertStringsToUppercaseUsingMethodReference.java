package PracticeArtiset.LambdaAndStreams.other;

import java.util.Arrays;
import java.util.List;

public class ConvertStringsToUppercaseUsingMethodReference {
    public static void main(String[] args) {
        List<String> al =Arrays.asList("apple","mango","banana", "kiwi", "orange", "ant");

        List<String> upperCaseStrings = al.stream().map(String::toUpperCase).toList();
        System.out.println("Uppercase strings: "+upperCaseStrings);
    }
}

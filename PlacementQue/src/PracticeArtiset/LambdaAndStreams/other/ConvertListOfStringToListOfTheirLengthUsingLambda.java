package PracticeArtiset.LambdaAndStreams.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringToListOfTheirLengthUsingLambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("apple","mango","banana", "kiwi", "orange"));
        System.out.println("Original String: "+ al);
        List<Integer> ans = al.stream().map(String::length).toList();
        System.out.println("Lengths of strings: "+ans);

    }
}

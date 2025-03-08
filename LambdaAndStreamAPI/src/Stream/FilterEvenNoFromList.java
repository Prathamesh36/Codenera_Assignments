package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNoFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,54,1,23,64,23,564,123,64,234,565,34,323,5765,34,1,54);

        //Filter

        List<Integer> filteredList = list.stream().filter(x -> x % 2 ==0).collect(Collectors.toList());
        System.out.println(filteredList);

        //Map
        List<Integer> mappedList=filteredList.stream().map(x -> x/2).collect(Collectors.toList());
        System.out.println(mappedList);

                                // OR

        List<Integer> filteredList1 = list.stream().filter(x -> x % 2 ==0).map(x -> x/2).collect(Collectors.toList());
        System.out.println(filteredList1);


        //distinct
        List<Integer> filteredList2 = list.stream().filter(x -> x % 2 ==0).map(x -> x/2).distinct().collect(Collectors.toList());
        System.out.println(filteredList2);


        //sorted
        List<Integer> filteredList3 = list.stream().filter(x -> x % 2 ==0).map(x -> x/2).distinct().sorted().collect(Collectors.toList());
        System.out.println(filteredList3);

        //sorting Descending
        List<Integer> filteredList4 = list.stream().filter(x -> x % 2 ==0).map(x -> x/2).distinct().sorted((a, b) -> (b - a)).collect(Collectors.toList());
        System.out.println(filteredList4);

        //Limit
        List<Integer> filteredList5 = list.stream().filter(x -> x % 2 ==0).map(x -> x/2).distinct().sorted((a, b) -> (b - a)).limit(4).collect(Collectors.toList());
        System.out.println(filteredList5);

        //skip
        List<Integer> filteredList6 = list.stream().filter(x -> x % 2 ==0).map(x -> x/2).distinct().sorted((a, b) -> (b - a)).limit(4).skip(1).collect(Collectors.toList());
        System.out.println(filteredList6);

        //printing 1 to 100 elements using stream
        List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(101).skip(1).collect(Collectors.toList());
        System.out.println(collect);


        //more methods
        // peek
        // count
        // max
        // min

    }
}

// Find the occurrence of a given character in a string using Stream API

public class  FindOccurenceOfGivenCharUsingStream {

    public static long count(String s, char ch){
        long occurrence = s.chars() // Convert the string to an IntStream of character codes
                .filter(x -> x == ch) // Filter the stream to include only the specified character
                .count(); // Count the number of occurrences
        return occurrence;

        //OR
//      return s.chars().filter(x -> x == ch).count();

    }
    public static void main(String[] args) {
        String str = "programming";
        char c = 'm';
        System.out.println(count(str,c));

    }
}

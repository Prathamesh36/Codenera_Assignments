import java.lang.reflect.Array;

public class FindOccurenceOfGivenCharUsingStream {

    public static long count(String s, char ch){
        long coo = s.chars().filter(c->c==ch).count();
        return coo;
    }
    public static void main(String[] args) {
        String str = "programming";
        char c = 'm';
        System.out.println(count(str,c));

    }
}

package March7;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String s1 = "java is object oriented programming language";
        System.out.println("String: "+s1);
        StringBuilder s2 = new StringBuilder();
        String[] str = s1.split(" ");
        for (int i=str.length-1;i>=0;i--) {
            s2.append(str[i]).append(" ");
        }
        System.out.println("reverse order of words: "+s2);
    }
}

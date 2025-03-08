package March7;

public class reverseString {
    public static void main(String[] args) {
        String str ="Codenera";
        System.out.println("String: "+str);
        String ansStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ansStr+=str.charAt(i);
        }
        System.out.println("Reverse String: "+ansStr);
    }
}

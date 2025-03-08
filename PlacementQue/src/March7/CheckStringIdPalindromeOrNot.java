package March7;

public class CheckStringIdPalindromeOrNot {
    public static void main(String[] args) {
        String a = "level";
        System.out.println("String: "+a);
        int start=0;
        int end=a.length()-1;
        int c=0;

        while(start<end){
            if(a.charAt(start)!=a.charAt(end)){
                c++;
            }
            start++;
            end--;
        }
        if(c==0){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}

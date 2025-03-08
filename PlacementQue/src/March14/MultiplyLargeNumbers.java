package March14;

public class MultiplyLargeNumbers {

    static String multiply(String n1 ,String n2){
        String s1 = new StringBuilder(n1).reverse().toString();
        String s2 = new StringBuilder(n2).reverse().toString();
        
        int[] m = new int[s1.length()+s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {

            }
        }
        return "";
    }

    public static void main(String[] args) {
        String a ="4154";
        String b ="51454";

        if(a.charAt(0)=='-' ){
            a=a.substring(1);
        }
        if(b.charAt(0)=='-'){
            b=b.substring(1);
        }

        System.out.println(multiply(a,b));
        
    }
}

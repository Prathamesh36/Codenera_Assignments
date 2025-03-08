import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromicPartitioning {

    public static boolean isPali(String a){
        StringBuilder sb = new StringBuilder(a);
        if(a.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String a= sc.next();
        List<String> ob = new ArrayList<>();
        int zero =0;
        int one=1;
        int first =zero;
        int second=one;
        while(first<a.length()) {
            while (second < a.length() + 1) {
                if (isPali(a.substring(first, second))) {
                    ob.add(a.substring(first, second));

                    second++;
                }
            }
            first=zero++;
            second=one++;
        }
        System.out.print("List: "+ob);

    }
}

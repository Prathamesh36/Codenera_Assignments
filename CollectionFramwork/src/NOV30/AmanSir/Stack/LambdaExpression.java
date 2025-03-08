package NOV30.AmanSir.Stack;

@FunctionalInterface
interface palindrome{
    public boolean disp(String a);
}

public class LambdaExpression {


    public static void main(String[] args) {
       palindrome ob =(name)->
       {
           String rev ="";
           for (int i = name.length()-1; i>=0 ; i--) {
               rev+=name.charAt(i);
           }
           if(rev==name) return true;
           else return false;
       };
        System.out.println(ob.disp("level"));
    }
}


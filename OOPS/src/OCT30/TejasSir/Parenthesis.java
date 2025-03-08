/*check parentheses are valied or not

        Input:

        char a[]= {'(', ')', '{', '}', '[', ']'};
        Output:

        Return true if the input string has balanced parentheses, and false otherwise.*/
package OCT30.TejasSir;

public class Parenthesis {
    public static void main(String[] args) {
        char a[]={'(',')', '{', '}', '[', ']'};
        int x=0;
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                count++;
            }
            if(a[i]=='['){
                count1++;
            }
            if(a[i]=='{'){
                count2++;
            }
            if(a[i]==')'){
                count--;
            }
            if(a[i]==']'){
                count1--;
            }
            if(a[i]=='}'){
                count2--;
            }
        }
        if(count==0 && count1==0 && count2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

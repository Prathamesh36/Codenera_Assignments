package OCT27;

public class ParenthesisCheck {
    public static void main(String[] args) {

        char a[]= {'(', ')', '{', '}', '[', ']'};
        char[] b = new char[a.length];
        int x=0;
        int rem=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='(' || a[i]=='{' || a[i]=='['){
                b[x]=a[i];
                x++;
                continue;
            }
            if(x>0 && b[x-1]==a[i]-2 || b[x-1]==a[i]-1){
                x--;
            }
            else{
                rem++;
            }
        }
        if(rem==0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }

    }
}

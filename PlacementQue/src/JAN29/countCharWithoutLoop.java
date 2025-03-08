package JAN29;

public class countCharWithoutLoop {

    public static int count(String s,char ch,int count){
        if(s.length()==0) return count;
        if(s.charAt(0)==ch) count++;
        return count(s.substring(1),ch,count);
    }

    public static void main(String[] args) {
        String s = "hello everyone";
        char ch = 'e';
        int count=0;
        System.out.println("Count: "+count(s,ch,count));
    }
}

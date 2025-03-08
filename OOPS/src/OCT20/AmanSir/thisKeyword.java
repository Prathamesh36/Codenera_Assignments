package OCT20.AmanSir;

public class thisKeyword {
    int a;
    int b;
    thisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void thiss(){
        System.out.print("Addition is: "+(a+b));
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        thisKeyword ob = new thisKeyword(a,b);
        ob.thiss();

    }
}

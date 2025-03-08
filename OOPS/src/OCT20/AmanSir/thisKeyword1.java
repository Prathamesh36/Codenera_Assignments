package OCT20.AmanSir;

public class thisKeyword1 {

    int a,b;
    public void disp(int a,int b){

        this.a=a;
        this.b=b;
    }
    public void disp1(int a,int b){
        this.disp(a,b);
        System.out.print((a+b));
    }


    public static void main(String[] args) {
        int a=5;
        int b=7;
        thisKeyword1 ob = new thisKeyword1();
        ob.disp1(a,b);

    }
}

package OCT25.AmanSir;

class parent{
        int a;
        int b;
        int c;
       /* parent(){
            System.out.println("Parent Constructor");
        }*/
        parent(int a,int b){
            this.a= a;
            this.b=b;
        }
        public void result(){
            System.out.println("Parent Method");
        }

}

public class SuperKeyWord extends parent{

    SuperKeyWord(int a,int b){
        super(a,b);
    }

    public void result(){
        System.out.println("Child Method");
    }
    public void disp(){
        super.result();

        result();
        int sum = super.a+super.b;
        System.out.print("Sum is: "+sum);
    }

    public static void main(String[] args) {
        int c=2;
        int a=6;
        int b=3;
        SuperKeyWord ob = new SuperKeyWord(a,b);
        ob.disp();
    }
}

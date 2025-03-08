public class ImplementStackUsingArray {
    int a[] = new int[10];
    int top=-1;

    public void pop(){
        if (top == -1) {
            System.out.println("Stack is empty..");
        }
        else{
            System.out.println(a[top]);
            top--;
        }
    }
    public void push(int elm) {
        top++;
        a[top]=elm;
    }
    public void peek(){
        if(top==-1){
            System.out.println("Stack is empty..");
        }
        else{
            System.out.println(a[top]);
        }

    }
    public void display(){
        for (int i = 0; i <=top; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        ImplementStackUsingArray ob = new ImplementStackUsingArray();
        System.out.print("Stack: ");
        ob.push(20);
        ob.push(40);
        ob.push(30);
        ob.push(70);
        ob.display();
        System.out.println();
        System.out.print("Popped elements: ");
        ob.pop();
        System.out.print("After pop: ");
        ob.display();
        System.out.println();
        System.out.print("Push Operation: ");
        ob.push(100);
        ob.display();
    }
}

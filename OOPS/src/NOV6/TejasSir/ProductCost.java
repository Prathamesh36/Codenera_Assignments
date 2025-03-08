package NOV6.TejasSir;

import java.util.Scanner;

class product{
    String Prod_name;
    int price;
    int quantity;

    public product(String prod_name, int price, int quantity) {
        setProd_name(prod_name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getProd_name() {
        return Prod_name;
    }

    public void setProd_name(String prod_name) {
        Prod_name = prod_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int cost(){
        int total_cost = price*quantity;
        return total_cost;
    }
}

public class ProductCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name= sc.next();
        System.out.print("Enter Price: ");
        int pri = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int qu = sc.nextInt();
        product pb = new product(name,pri,qu);
        System.out.println("Product Name: "+pb.getProd_name());
        System.out.println("Price: "+pb.getPrice());
        System.out.println("Quantity: "+pb.getQuantity());
        System.out.println("Total Cost: "+pb.cost());

    }
}

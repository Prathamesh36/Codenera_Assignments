/*Implement Comparable for a Product class considering their prices.*/
package JAN3.Que3;

class product implements Comparable<product>{
    private String product_name;
    private int price;

    public product(String product_name, int price) {
        this.product_name = product_name;
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n{" +
                "product_name='" + product_name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(product o) {
        return this.price-o.price;
    }
}

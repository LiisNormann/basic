package week4;

public class Product {
    private String product;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.product = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.product + ", price " + this.price + ", amount " + this.amount);
    }
}

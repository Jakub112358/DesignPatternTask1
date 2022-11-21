import java.util.List;

public class Customer {
    private String id;
    private List<Product> basket;

    public Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Product> getBasket() {
        return basket;
    }
    void addProduct(Product product){
        this.basket.add(product);
    }
}

package course.files;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double Total(){
        return price * quantity;
    }

    public String toString(){
        return name + "," + Total();
    }
}

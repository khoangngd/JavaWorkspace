package tls.demo.aml.models;

public class Product {
    private  Long id;
    private String productName;
    private int year;
    private Double price;
    private String url;

    public Product() { }

    public Product(Long id, String productName, int year, Double price, String url) {
        this.id = id;
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}

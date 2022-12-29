package Minterfaces.Arquivos;

public class ProductService implements Comparable<ProductService>{

    private String name;
    private Double price;

    public ProductService(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(ProductService other) {
        return price.compareTo(other.getPrice());
    }
}

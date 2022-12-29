package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.Locale;
import java.util.Objects;

public class SetProductTest06 implements Comparable<SetProductTest06>{
    private String name;
    private Double price;

    public SetProductTest06(String name, Double price) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetProductTest06 that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "SetProductTest06{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(SetProductTest06 other) {
        return name.toUpperCase(Locale.ROOT).compareTo(other.getName().toUpperCase());
    }
}

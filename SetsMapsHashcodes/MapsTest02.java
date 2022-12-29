package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.HashMap;
import java.util.Map;

public class MapsTest02 {

    public static void main(String[] args) {

        Map<ProductMapsTest02, Double> stock = new HashMap<>();

        ProductMapsTest02 p1 = new ProductMapsTest02("Tv", 900.00);
        ProductMapsTest02 p2 = new ProductMapsTest02("Notebook", 1200.00);
        ProductMapsTest02 p3 = new ProductMapsTest02("Tablet", 400.00);

        stock.put(p1, 10000.00);
        stock.put(p2, 20000.00);
        stock.put(p3, 15000.00);

        ProductMapsTest02 ps = new ProductMapsTest02("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}

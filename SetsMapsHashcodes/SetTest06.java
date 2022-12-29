package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest06 {

    public static void main(String[] args) {

        Set<SetProductTest06> set = new HashSet<>();

        set.add(new SetProductTest06("TV", 900.00));
        set.add(new SetProductTest06("Notebook", 1200.00));
        set.add(new SetProductTest06("Tablet", 400.00));

        SetProductTest06 prod = new SetProductTest06("Notebook", 1200.00);

        System.out.println(set.contains(prod));




    }
}

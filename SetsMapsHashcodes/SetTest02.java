package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest02 {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(); // O TreeSet ordena os dados, no caso de String ele ordena as letras, porém ele é muito mais lento em comperação ao HashSet
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Computador");
        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);

        }
    }
}

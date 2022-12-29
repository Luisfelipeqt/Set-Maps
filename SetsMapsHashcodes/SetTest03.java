package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest03 {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>(); // O LinkedHashSet mantém a ordem em que os itens foram adicionado pelo metodo set.add(); e tem uma velocidade um pouco inferior ao HashSet porém mantém a ordem dos dados.
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

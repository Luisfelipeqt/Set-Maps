package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest04 {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>(); // O LinkedHashSet mantém a ordem em que os itens foram adicionado pelo metodo set.add(); e tem uma velocidade um pouco inferior ao HashSet porém mantém a ordem dos dados.
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Computador");

        set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3); // O removeIf recebe como Argumento um Predicado(LAMBDA)
        set.removeIf(x -> x.charAt(0) == 'T'); // O removeIf recebe como Argumento um Predicado(LAMBDA)
        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);

        }
    }
}

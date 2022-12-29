package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // O HashSet não garante a ordem do set.add, ele é rapido mas não mantém a ordem.
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

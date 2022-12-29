package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest05 {

    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Union ------> Une A + B
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection ---------- > Só mostra quem está no A + B
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difference  --------------- > Que tem no conjunto A mas não tem no conjunto B
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


    }
}

package Minterfaces.Arquivos.SetsMapsHashcodes;

import java.util.Map;
import java.util.TreeMap;

public class MapsTest01 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>(); // TreeMap Ordena os dados

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "98997198565");

        cookies.remove("email");
        cookies.put("phone", "16997198565");

        System.out.println("Contains 'phone' key : " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}

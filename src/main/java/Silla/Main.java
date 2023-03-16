package Silla;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Silla, Integer> map = new TreeMap<>();

        map.put(new Silla(25, "Silla3"), 25);
        map.put(new Silla(24, "Silla2"), 24);
        map.put(new Silla(23, "Silla1"), 23);
        map.put(new Silla(26, "Silla4"), 26);

        for (Map.Entry<Silla, Integer> entry : map.entrySet()) {
            Silla key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key:" + key + "  " + "value:" + value);
        }
        System.out.println("");

        
        List<Silla> lista = new ArrayList<>();
        lista.add(new Silla(25, "Silla3"));
        lista.add(new Silla(24, "Silla2"));
        lista.add(new Silla(23, "Silla1"));
        lista.add(new Silla(26, "Silla4"));
        System.out.println("Segun orden de insercion");
        lista.forEach(s -> System.out.println("nombre:" + s.getNombre()));
        System.out.println("");

        
        System.out.println("Segun orden natural");
        Collections.sort(lista);
        lista.forEach(s -> System.out.println("nombre:" + s.getNombre()));
        System.out.println("");

        
        System.out.println("Segun orden peso");
        /////////////////////////////////

    }
}

package ej15;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList<Legislador> list = new ArrayList<>();

        Diputado diputado1 = new Diputado(1, "provincia1", "partido1", "deputado1", "deputado1");
        Diputado diputado2 = new Diputado(2, "provincia2", "partido2", "deputado2", "deputado2");
        Diputado diputado3 = new Diputado(3, "provincia3", "partido3", "deputado3", "deputado3");

        Senador senador1 = new Senador(1, "provincia1", "partido1", "deputado1", "deputado1");
        Senador senador2 = new Senador(2, "provincia1", "partido1", "deputado1", "deputado1");
        Senador senador3 = new Senador(3, "provincia1", "partido1", "deputado1", "deputado1");
        
        list.add(senador3);
        list.add(senador2);
        list.add(diputado1);
        list.add(diputado3);
        list.add(diputado2);
        list.add(senador1);
        
        list.forEach(s -> System.out.println(s.getCamaraEnQueTrabaja()));
        
        
    }
}

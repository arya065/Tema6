package ej14;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList<Silencioso> list = new ArrayList<>();
        
        Frigorifico fr1 = new Frigorifico(1000, 10, "fr1");
        Microondas mc1 = new Microondas(1000,20, "mc1");
        CampanaExtractora ce1 = new CampanaExtractora(60, 30, "ce1");
        
        list.add(fr1);
        list.add(mc1);
        //list.add(ce1);  no deja porque no esta implementada
    }
}

package Tarea6B;

import java.util.*;
import java.time.*;

public class Test {

    public static void main(String[] args) {
        Museo museo = new Museo("museo", "direccion museo");

        //sensores
        Humedad hum1 = new Humedad(10, 0, 1);
        Humedad hum2 = new Humedad(20, 0, 2);
        Temperatura temp1 = new Temperatura(10, 0, 1);
        Temperatura temp2 = new Temperatura(20, 0, 2);

        // salas fijas
        SalaFija salaFija1 = new SalaFija("estado1", temp1, hum1);
        SalaFija salaFija2 = new SalaFija("salaFija2", temp2, hum2);
        museo.anadirSala(salaFija1);
        museo.anadirSala(salaFija2);

        //obras
        Pintura pintura = new Pintura(1, "autor");
        Esculptura esculptura = new Esculptura(2, "autor");

        //anadir obras a salas
        salaFija1.anadirObra(pintura);
        salaFija2.anadirObra(esculptura);

        //set de obras
        Set<Obra> setObras = new HashSet<>();

        //anadir obras a set
        for (int i = 0; i < museo.getSalas().size(); i++) {
            SalaFija tmp = (SalaFija) museo.getSalas().get(i);
            for (int j = 0; j < tmp.getObras().size(); j++) {
                setObras.add(tmp.getObras().get(j));
            }
        }

        //conservadores
        Escultoricos esculpturico = new Escultoricos("nif1", "esculpturico");
        Pictoricos pictorico = new Pictoricos("nif2", "pictorico");
        museo.contratar(pictorico);
        museo.contratar(esculpturico);

        //restauracion
        pictorico.restaurar(pintura);
        pictorico.restaurar(esculptura);

    }

}

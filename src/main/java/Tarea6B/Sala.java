package Tarea6B;

import java.util.*;

abstract class Sala {

    private Temperatura temp;
    private Humedad hum;
    private ArrayList<Obra> obras;

    public Sala(Temperatura temp, Humedad hum) {
        this.temp = temp;
        this.hum = hum;
        this.obras = new ArrayList<>();
    }

    public Temperatura getTemp() {
        return temp;
    }

    public Humedad getHum() {
        return hum;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void anadirObra(Obra tmp) {
        obras.add(tmp);
    }

    public void quitarObra(Obra tmp) {
        obras.remove(tmp);
    }

}

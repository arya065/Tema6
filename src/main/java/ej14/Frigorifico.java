package ej14;

public class Frigorifico extends Electrodomestico implements Silencioso {

    private int capacidad;

    public Frigorifico(int capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    @Override
    public void silencio() {
        System.out.println("El frigorifico de este modelo emite 50 dB");
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidad=" + capacidad + '}';
    }

}

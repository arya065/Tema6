package Tarea6B;

public class Humedad extends Sensor {

    private double max_humedad;
    private double min_humedad;

    public Humedad(double max_humedad, double min_humedad, int id) {
        super(id);
        this.max_humedad = max_humedad;
        this.min_humedad = min_humedad;
    }

    @Override
    void alarma() {
        System.out.println("Alarma");
    }

}

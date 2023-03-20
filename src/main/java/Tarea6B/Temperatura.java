package Tarea6B;

public class Temperatura extends Sensor {

    private double max_temp;
    private double min_temp;

    public Temperatura(double max_temp, double min_temp, int id) {
        super(id);
        this.max_temp = max_temp;
        this.min_temp = min_temp;
    }

    @Override
    void alarma() {
        System.out.println("Alarma");
    }
}

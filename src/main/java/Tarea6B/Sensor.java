package Tarea6B;

abstract class Sensor {

    private int id;

    public Sensor(int id) {
        this.id = id;
    }

    abstract void alarma();
}

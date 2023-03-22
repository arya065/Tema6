package Tarea6B;

public class Empleado implements Comparable<Empleado> {

    private String nif;
    private String nombre;

    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Empleado o) {
        return nif.compareTo(o.getNif());
    }

}

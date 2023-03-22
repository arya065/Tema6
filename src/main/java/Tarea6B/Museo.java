package Tarea6B;

import java.util.*;

public class Museo {

    private ArrayList<Empleado> empleados;
    private ArrayList<Sala> salas;
    private String nombre;
    private String direccion;

    public Museo(String nombre, String direccion) {
        this.empleados = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void despedir(Empleado tmp) {
        empleados.remove(tmp);
    }

    public void contratar(Empleado tmp) {
        empleados.add(tmp);
    }

    public void anadirSala(Sala tmp) {
        salas.add(tmp);
    }

    public void quitarSala(Sala tmp) {
        salas.remove(tmp);
    }
}

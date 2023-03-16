package Tarea6A;

import java.util.*;

public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamaras;
    private ArrayList<Paciente> listPacientes;
    private ArrayList<Empleado> listEmpleados;

    public Hospital(String nombre, String direccion, int numeroCamaras) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamaras = numeroCamaras;
        this.listPacientes = new ArrayList<>();
        this.listEmpleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado emp) {
        listEmpleados.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {
        listPacientes.add(paciente);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroCamaras() {
        return numeroCamaras;
    }

    public ArrayList<Paciente> getListPacientes() {
        return listPacientes;
    }

    public ArrayList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

}

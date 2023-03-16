package Tarea6A;

abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double salario;

    abstract double calcularIRPF();

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
        super(nombre, apellido, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

}

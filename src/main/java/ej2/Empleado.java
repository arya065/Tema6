package ej2;

public class Empleado extends Persona {

    private int salario;

    public Empleado(int salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + '}';
    }

    public void subirSalario(int plus) {
        this.salario += plus;
    }
}

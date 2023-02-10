package ej2;

public class Programador extends Empleado {

    private categori categoria;

    public Programador(categori categoria, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public Programador() {
    }

    public categori getCategoria() {
        return categoria;
    }

    public void setCategoria(categori categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Programador{" + "categoria=" + categoria + '}';
    }

    public enum categori {
        JUNIOR,
        ANALISTA,
        SENIOR;
    }
}

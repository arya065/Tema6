package ej15;

public class Senador extends Legislador {

    private int salarioExtra;

    public Senador(int salarioExtra, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellido) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellido);
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String toString() {
        return "Senador{" + "salarioExtra=" + salarioExtra + '}';
    }

    @Override
    String getCamaraEnQueTrabaja() {
        return "Senador";
    }

}

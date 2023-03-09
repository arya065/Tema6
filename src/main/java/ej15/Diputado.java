package ej15;

public class Diputado extends Legislador {

    private int numAsiento;

    public Diputado(int numAsiento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellido) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellido);
        this.numAsiento = numAsiento;
    }

    @Override
    String getCamaraEnQueTrabaja() {
        return "Diputado";
    }

}

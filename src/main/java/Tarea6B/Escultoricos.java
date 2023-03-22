package Tarea6B;

public class Escultoricos extends Conservadores {

    public Escultoricos(String nif, String nombre) {
        super(nif, nombre);
    }

    @Override
    public void restaurar(Obra tmp) {
        if (tmp.getClass().equals(Pintura.class)) {
            System.out.println("No se puede restaurar pinturas");
        } else {
            System.out.println("Escultorico esta restaurando");
        }
    }

}

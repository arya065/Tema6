package Tarea6B;

public class Pictoricos extends Conservadores {

    public Pictoricos(String nif, String nombre) {
        super(nif, nombre);
    }

    @Override
    public void restaurar(Obra tmp) {
        if (tmp.getClass().equals(Esculptura.class)) {
            System.out.println("No se puede restaurar esculpturas");
        } else {
            System.out.println("Pictorico esta restaurando");

        }
    }

}

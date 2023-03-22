package Tarea6B;

public class Esculptura extends Obra {

    public Esculptura(int id, String autor) {
        super(id, autor);
    }

    @Override
    public int compareTo(Obra o) {
        return getAutor().compareTo(o.getAutor());
    }

}

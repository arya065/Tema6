package Tarea6B;

public class Pintura extends Obra {

    public Pintura(int id, String autor) {
        super(id, autor);
    }

    @Override
    public int compareTo(Obra o) {
        return getAutor().compareTo(o.getAutor());
    }

}
